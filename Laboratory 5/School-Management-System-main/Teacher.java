public class Teacher extends Person {
    String department;
    Course course1;
    Course course2;

    public Teacher(String name, int age, String gender, String department, Course course1, Course course2) {
        super(name, age, gender);
        this.department = department;
        this.course1 = course1;
        this.course2 = course2;
    }
    public void displayTeacher() {
        System.out.println("\n--- Teacher Information ---");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses Handled: ");
        course1.displayCourse();
        course1.displayCourse();
    }
}
