package inheritance.constructors.explicit;

public class A {

    // Since A's superclass is Object, and Object has no-arg constructor,
    // no need to explicitly call super() here.
    public A(int x) {
        System.out.println("A");
    }

}
