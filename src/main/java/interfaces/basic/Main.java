package interfaces.basic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Interfaces may be used as the TYPE
        Service dbService = new DatabaseService();
        // But they may not be instantiated (just like abstract classes)
        // Service service = new Service();  // ERROR: Service is abstract; cannot be instantiated

        // The concrete classes that implement the interface may have wildly different implementations
        // and underlying technologies, but they can be used interchangeably because they all
        // implement the same interface!
        Service fileService = new FileService();

        // Interfaces may be used as the TYPE of a List
        // Even though the list contains different concrete implementations of the interface,
        // they can be used interchangeably because they all implement the same interface!
        List<Service> services = List.of(dbService, fileService);
        runServices(services);

    }

    // Since this method takes a List of Services, it can be used with any List of Services,
    // even if the concrete implementations are wildly different.
    // Even if new concrete implementations of the Service interface are added in the future!
    // This is another example of POLYMORPHISM (the ability to use the same code with different types)
    public static void runServices(List<Service> services) {
        for (Service service : services) {
            // The methods called here are determined at runtime depending on the concrete class of the service object
            service.doSomething();
            service.doSomethingElse("Hello");
        }
    }
}
