public class Student extends Person {
    String studentId;

    public Student( String name, int age, String gender, String studentId) { 
        super(name, age, gender);
        this.studentId = studentId;
    }
    public void displayStudent() {
        System.out.println("--- Student Information ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
