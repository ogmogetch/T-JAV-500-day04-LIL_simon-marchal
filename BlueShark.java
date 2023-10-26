public class BlueShark extends Shark{
    
    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return animal.type == Type.fish;
    }

    @Override
    public void eat(Animal animal){
        if (canEat(animal)) {
            System.out.println(name + " ate a " + animal.type + " named " + animal.name + ".");
            boolean frenzy = false;
        } else {
            System.out.println(name + ": It's not worth my time.");
        }
    }
}
