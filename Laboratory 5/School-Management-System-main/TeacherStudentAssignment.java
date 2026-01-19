public class TeacherStudentAssignment {
    public static void main(String[] args) {

        // I created here a instance which is the student with instance method to display student
        Student student1 = new Student("Ana Santos", 19, "Female", "S1023");
        student1.displayStudent();

        // Here I create a course object
        Course course1 = new Course("CS101", "Programming Fundamentals");
        Course course2 = new Course("CS102", "Object-Oriented Programming");

        // I created a teacher instance here with instance method to display it
        Teacher teacher1 = new Teacher("Mr. Dela Cruz", 45, "Male", "Computer Studies", course1, course2);
        teacher1.displayTeacher();
    }
}