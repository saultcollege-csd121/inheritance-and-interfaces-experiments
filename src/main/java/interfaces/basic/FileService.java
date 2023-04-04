package interfaces.basic;

// The implements keyword is followed by the name of the interface the class is implementing.
public class FileService implements Service {

    // The class must implement all methods defined in the interface.
    @Override
    public void doSomething() {
        System.out.println("FileService is doing something using the underlying file system");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("FileService is doing something else file-based with " + arg);
    }
}
