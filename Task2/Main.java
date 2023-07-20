public class Main {
    public static void main(String[] args) {
        // Create an instance of University
        University university = new University("XYZ University");
        // Create departments, courses, and instructors
        Department department1, department2;
        department1 = new Department("Computer Science");
        department2 = new Department("Mathematics");
        Course compSci1, compSci2, math1, math2;
        compSci1 = new Course("CSE101");
        compSci2 = new Course("CSE201");
        math1 = new Course("MAT101");
        math2 = new Course("MAT201");
        Instructor instructor1, instructor2, instructor3, instructor4;
        instructor1 = new Instructor("John Doe");
        instructor2 = new Instructor("Jane Smith");
        instructor3 = new Instructor("David Johnson");
        instructor4 = new Instructor("Emily Brown");
        // Add courses and instructors to departments
        department1.addCourse(compSci1);
        department1.addCourse(compSci2);
        department1.addInstructor(instructor1);
        department1.addInstructor(instructor2);

        department2.addCourse(math1);
        department2.addCourse(math2);
        department2.addInstructor(instructor3);
        department2.addInstructor(instructor4);
        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);
        // Display the details of the university
        university.displayDetails();
    }
}
