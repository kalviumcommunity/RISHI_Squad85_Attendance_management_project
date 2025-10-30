public class AttendanceRecord {
    private Student student;
    private Course course;
    private String status; // e.g., "Present" or "Absent"

    // Constructor
    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        this.status = status;
    }

    // Getters
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    // Display a richer record
    public void displayRecord() {
        System.out.println(
            "Student: " + student.getName() + " (ID: " + student.getId() + ")" +
            " | Course: " + course.getCourseName() + " (ID: " + course.getCourseId() + ")" +
            " | Status: " + status
        );
    }

    // Prepare data for file storage
    public String toDataString() {
        return student.getId() + "," + course.getCourseId() + "," + status;
    }
}
