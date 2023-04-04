package inheritance.overriding.school;

import java.util.List;

public class Instructor extends Employee {

        private List<Course> courses;

        public Instructor(String name, String address, String employeeId) {
            super(name, address, employeeId);
        }

        public void addCourse(Course course) {
            courses.add(course);
        }
}
