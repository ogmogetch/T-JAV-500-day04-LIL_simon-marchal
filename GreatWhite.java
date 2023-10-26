public class GreatWhite extends Shark{

    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            System.out.println(name + ": Next time you try to give me that to eat, I'll eat you instead.");
            return false;
        }
        return true;
    }

    @Override

    public void eat(Animal animal){
        if (canEat(animal)) {
            System.out.println(name + " ate a " + animal.type + " named " + animal.name + ".");
            frenzy = false;
        } else {
            System.out.println(name + ": It's not worth my time.");
        }
    }
}
