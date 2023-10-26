import java.lang.reflect.Field;
import java.text.NumberFormat;

public class Animal {
/*
In this exercise, use plural when necessary.
The plural of “fish” is “fish”.
Implement a private static field numberOfAnimals and it’s getter getNumberOfAnimals which:
3 returns the number of Animal instances ;
3 displays a sentence such as one of the following:
– There are currently [x] animals in our world. ;
– There is currently [x] animal in our world..
The method to handle this is up to you.
You must also implement 3 variants of this for the following private static fields:
3 numberOfMammals ;
3 numberOfFish ;
3 numberOfBirds.
They return the number of instance for each type of instance / alive animals in the world.
They display a message such as There (is|are)currently [x] [type](s)in our world..
An example would be There are currently 3 mammals in our world..
Animals never die.
3
 */
    protected enum Type {
        mammal,
        fish,
        bird
    }

    protected String name;
    protected int legs;
    protected Type type;

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;
        switch (type) {
            case mammal:
                numberOfMammals++;
                break;
            case fish:
                numberOfFish++;
                break;
            case bird:
                numberOfBirds++;
                break;
        }
        System.out.println("My name is " + name + " and I am a " + type + "!");
    }

    public static void displayAnimalCounts() {
        System.out.println("There are currently "+ numberOfAnimals +" animals in our world.");
        System.out.println("There are currently "+ numberOfMammals +" mammals in our world.");
        System.out.println("There are currently "+ numberOfFish +" fishs in our world.");
        System.out.println("There are currently "+ numberOfBirds +" birds in our world.");
    }


    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public Type getType() {
        return type;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }
}
