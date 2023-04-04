package inheritance.overriding.type_vs_class;

public class Cassowary extends Bird {

    @Override
    public void doAnimalStuff() {
        System.out.println("Animaling like a cassowary...");
    }

    @Override
    public void doBirdStuff() {
        System.out.println("Birding like a cassowary...definitely not flying...");
    }

    public void doCassowaryStuff() {
        System.out.println("Feeling sad because flightless...");
    }
}
