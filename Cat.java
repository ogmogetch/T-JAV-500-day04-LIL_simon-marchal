public class Cat extends Animal{
    /*
    Create a new Cat class that inherits from Animal.
It has a private color attribute, with a getter only (a setter would be animal cruelty!).
When Cat is created, display [name]: MEEEOOWWWW.
     */
    private String color;

    public Cat(String name, String color) {
        super(name, 4, Type.mammal);
        this.color = color;
        System.out.println(name + ": MEEEOOWWWW");
    }

    public void meow() {
        System.out.println(name +" the " + color + " kitty is meowing.");
    }
}
