package inheritance.overriding.type_vs_class;

public class Bird extends Animal {

    // Try commenting out this method and see what happens in the main method
    @Override
    public void doAnimalStuff() {
        System.out.println("Animaling like a bird...");
    }

    public void doBirdStuff() {
        System.out.println("Birding...");
    }
}
