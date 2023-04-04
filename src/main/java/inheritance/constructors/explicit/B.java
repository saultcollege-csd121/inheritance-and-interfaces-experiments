package inheritance.constructors.explicit;

public class B extends A {

    public B(int x, int y) {
        // Since A has no default constructor, we must explicitly call A's constructor
        super(x);
        System.out.println("B");
    }
}
