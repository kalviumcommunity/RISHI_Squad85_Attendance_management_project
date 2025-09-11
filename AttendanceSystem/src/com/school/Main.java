package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Students
        Student student1 = new Student("Alice Wonderland", "Grade 10");
        Student student2 = new Student("Bob The Builder", "Grade 9");

        // Create Teacher
        Teacher teacher1 = new Teacher("Dr. Emily Carter", "Physics");

        // Create Staff
        Staff staff1 = new Staff("Mr. John Davis", "Librarian");

        // Display details
        System.out.println("=== People in the School ===");
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        staff1.displayDetails();
        System.out.println();

        // Create Course
        Course course1 = new Course("Intro to Quantum Physics"); 

        // Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        AttendanceRecord record1 = new AttendanceRecord(
            student1.getId(), course1.getCourseId(), "Present"
        );
        AttendanceRecord record2 = new AttendanceRecord(
            student2.getId(), course1.getCourseId(), "Daydreaming"
        );

        attendanceLog.add(record1);
        attendanceLog.add(record2);

        // Print Attendance
        System.out.println("=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) {
            System.out.println(record);
        }
    }
}
