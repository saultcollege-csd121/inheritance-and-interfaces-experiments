package inheritance.constructors.explicit;

public class C extends B {

    public C(int x) {
        // Since B has no default constructor, we must explicitly call B's constructor
        super(x, 2);
        System.out.println("C");
    }
}
