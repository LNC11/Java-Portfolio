public class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public void displayCourse() {
        System.out.println("   " + courseCode + " - " + courseName);
    }
}
