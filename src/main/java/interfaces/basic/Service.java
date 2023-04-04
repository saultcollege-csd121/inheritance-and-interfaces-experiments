package interfaces.basic;

// Interfaces are a way to define a contract of behaviour between a class and the outside world.
// They are a way to define a set of methods that a class MUST implement.
public interface Service {

    // All methods in an interface are implicitly public and abstract,
    // so you don't need to specify visibility or the abstract keyword,
    // and you don't need to provide a method body.
    void doSomething();
    void doSomethingElse(String arg);

    // You can also define default methods in an interface.
    // These are methods that have a default implementation that can be used by any class that implements the interface.
    default void doSomethingDefault() {
        System.out.println("This is the default implementation of doSomethingDefault");
    }

    // Typically, interfaces define no state, but they can define class variables.
    // Class variables are static and final by default
    int MAX = 100;

    // They cannot, however, define instance variables
    // protected int x = 5;  // ERROR: Illegal modifier for the interface field Service.x; only public, static & final are permitted

    // class methods can be defined as of
}
