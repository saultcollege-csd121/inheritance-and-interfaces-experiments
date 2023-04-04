package inheritance.overriding.school;

public class Employee extends Person {

    protected  String employeeId;
    protected Employee supervisor;

    public Employee(String name, String address, String employeeId) {
        super(name, address);
        this.employeeId = employeeId;
    }

}
