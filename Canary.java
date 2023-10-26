public class Canary extends Animal{
    /*
    Your Canary class must have a private eggs attribute, which indicates how many eggs it has laid in
its life.
During initialization, Canary only takes one parameter: its name.
Initialize legs to 2, type to BIRD and eggs to 0.
Display Yellow and smart? Here I am! when a Canary is created.
Add a getEggsCount method that returns the number of eggs laid by the Canary.
Add a layEgg method that increases the number of eggs laid by 1.
     */

    private int eggs;

    public Canary(String name) {
        super(name, 2, Type.bird);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }

    public int getEggsCount() {
        return eggs;
    }

    public void layEgg() {
        eggs++;
    }
}
