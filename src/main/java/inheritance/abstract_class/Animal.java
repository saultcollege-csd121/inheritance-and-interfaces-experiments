package inheritance.abstract_class;

// IMPORTANT: A class with abstract methods must be declared abstract.
public abstract class Animal {

    protected String name;

    // An abstract class can have a constructor.
    // This constructor will be called when an object of a subclass is created.
    // However, an Animal object cannot be created directly because Animal is abstract.
    public Animal(String name) {
        this.name = name;
    }

    // An abstract method is a method that is declared without an implementation.
    // Any subclass of Animal must implement the makeSound method.
    public abstract void makeSound();
}
