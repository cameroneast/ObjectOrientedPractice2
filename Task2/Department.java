
import java.util.ArrayList;
import java.util.List;

public class Department {
    // Attributes
    String name;
    List<Course> courses;
    List<Instructor> instructors;

    // Constructor
    public Department(String name) {
        this.name = name;
        courses = new ArrayList<>();
        instructors = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(Course course) {
        // Add course to the list
        courses.add(course);
    }

    // Method to add an instructor
    public void addInstructor(Instructor instructor) {
        // Add instructor to the list
        instructors.add(instructor);
    }

    // Method to display department details
    public void displayDetails() {
        // Display department details
        System.out.println("Department: " + this.name);
        System.out.println("Courses:");
        for (Course c : courses) {
            c.displayDetails();
        }
        System.out.println("Instructors:");
        for (Instructor i : instructors) {
            i.displayDetails();
        }
    }
}
