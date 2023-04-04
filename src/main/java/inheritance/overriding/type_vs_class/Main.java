package inheritance.overriding.type_vs_class;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // The type of the variable (the identifier to the LEFT of the variable name) determines which methods can be called
        // The class (the identifier to the RIGHT of new) of the created object determines which methods are ACTUALLY called
        Animal a = new Animal();
        a.doAnimalStuff();        // This will call the method in the Animal class because the object is an Animal
        // a.doBirdStuff();       // This will not compile because the type of the variable is Animal, not Bird
        // a.doCassowaryStuff();  // This will not compile because the type of the variable is Animal, not Cassowary
        Bird b = new Bird();
        b.doAnimalStuff();        // This will call the method in the Bird class because the object is a Bird
        b.doBirdStuff();          // This will call the method in the Bird class because the object is a Bird
        // b.doCassowaryStuff();  // This will not compile because the type of the variable is Bird, not Cassowary
        Cassowary c = new Cassowary();
        // These calls will all call the Cassowary methods because c is a Cassowary object
        c.doAnimalStuff();
        c.doBirdStuff();
        c.doCassowaryStuff();

        // HOWEVER, what if the TYPE and the object's CLASS are different?
        // Here, the TYPE of the variable is Animal, but the object is a Cassowary
        // This is OK because Cassowary is a subclass of Animal (a Cassowary IS an Animal)
        Animal c2 = new Cassowary();

        // This will call the method in the Cassowary class because the object is a Cassowary
        // This is an example of DYNAMIC METHOD DISPATCH (the method called is determined at runtime)
        c2.doAnimalStuff();
        // But neither of these will compile because the TYPE of the variable is Animal, so only Animal methods can be called:
        // c2.doBirdStuff();
        // c2.doCassowaryStuff();

        // Since Bird and Cassowary are subclasses of Animal, they can be added to a list of Animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Bird());
        animals.add(new Cassowary());

        // A list of Birds, however cannot contain plain Animal objects
        List<Bird> birds = new ArrayList<>();
        // list.add(new Animal()); // This will not compile because an Animal is not a Bird
        birds.add(new Bird());
        birds.add(new Cassowary());

        for (Animal animal : animals) {
            // This will call the method in whichever class the object is
            // If the object is an Animal, it will call the Animal method;
            // if the object is a Bird, it will call the Bird method;
            // if the object is a Cassowary, it will call the Cassowary method
            // This is an example of DYNAMIC METHOD DISPATCH (the method called is determined at runtime)
            animal.doAnimalStuff();

            // We can use instanceof to check the type of the object and call methods specific to that type
            if (animal instanceof Bird bird) {
                bird.doBirdStuff();
            }

            if ( animal instanceof Cassowary cass) {
                cass.doCassowaryStuff();
            }
        }

    }
}
