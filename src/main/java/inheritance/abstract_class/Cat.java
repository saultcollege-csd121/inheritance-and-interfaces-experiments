package inheritance.abstract_class;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // This method is abstract in the superclass, so we have to implement it here.
    // (Try removing this method and see what happens.)
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}
