package inheritance.overriding.school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    protected String studentId;
    protected List<Course> courses = new ArrayList<>();

    public Student(String name, String address, String studentId) {
        super(name, address);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "'" +
                ", address='" + address + "'" +
                ", studentId='" + studentId + "'" +
                '}';
    }

    // Here we override the equals method from the Object class so that we can compare
    // two Student objects to see if they are equal.  We do this by comparing the
    // studentId fields of the two objects.
    @Override
    public boolean equals(Object obj) {
        System.out.println("Hello from Student.equals(Object obj) method");
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Student other)) {
            return false;
        }

        if ( other.studentId == null || this.studentId == null) {
            return false;
        }

        return other.studentId.equals(this.studentId);

    }
}
