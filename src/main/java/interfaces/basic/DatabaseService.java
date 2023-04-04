package interfaces.basic;

public class DatabaseService implements Service {

        @Override
        public void doSomething() {
            System.out.println("DatabaseService is doing something using an underlying database");
        }

        @Override
        public void doSomethingElse(String arg) {
            System.out.println("DatabaseService is doing something else database-based with " + arg);
        }
}
