public class Shark extends Animal{
    private boolean frenzy = false;
    public Shark(String name) {
        super(name, 0, Type.fish);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean blood) {
        frenzy = blood;
    }

    public void status() {
        if (frenzy) {
            System.out.println(name + " is smelling blood and wants to kill.");
        } else {
            System.out.println(name + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        return this != animal;
    }

    public void eat(Animal animal){
        if (canEat(animal)) {
            System.out.println(name + " ate a " + animal.type + " named " + animal.name + ".");
            frenzy = false;
        } else {
            System.out.println(name + ": It's not worth my time.");
        }
    }
}
