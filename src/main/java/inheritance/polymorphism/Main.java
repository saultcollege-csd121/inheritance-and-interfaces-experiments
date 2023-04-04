package inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Since each of these classes inherits from Animal, they can be
        // added to the array of type Animal.
        var animals = new Animal[] {
            new Animal(),
            new Dog(),
            new Wolf(),
            new Cat(),
            new Lion(),
            new Chihuahua()
        };

        // Since each of these classes overrides the makeNoise() method,
        // the correct method will be called for each object.
        // This is called POLYMORPHISM.
        for (var animal : animals) {
            animal.makeNoise();
        }
    }
}
