package inheritance.overriding.school;

public class Main {

    public static void main(String[] args) {
        var s1 = new Student("John", "123 Main St", "123-456-7891");
        var s2 = new Student("John", "123 Main St", "123-456-7890");

        System.out.println(s1.equals(s2));
    }
}
