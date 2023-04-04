package inheritance.constructors.parameterless;

public class Main {

    public static void main(String[] args) {


        A a = new C();

        C c = new C();
        C c2 = c;
        C c3 = new C();

        System.out.println(c.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
