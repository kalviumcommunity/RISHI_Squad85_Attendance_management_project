package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Polymorphic display method
    public static void displaySchoolDirectory(List<Person> people) {
        for (Person person : people) {
            person.displayDetails(); // runtime polymorphism
        }
    }

    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        // Create Teacher & Staff
        Teacher t1 = new Teacher(101, "Mr. Smith");
        Staff st1 = new Staff(201, "Jane Doe");

        // Polymorphic list
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        // Display school directory
        displaySchoolDirectory(schoolPeople);

        // Create Courses
        Course c1 = new Course(301, "Mathematics");
        Course c2 = new Course(302, "History");

        // Create Attendance Records
        AttendanceRecord r1 = new AttendanceRecord(s1, c1, "Present");
        AttendanceRecord r2 = new AttendanceRecord(s2, c2, "Absent");

        // Display Attendance Records
        r1.displayRecord();
        r2.displayRecord();

        // Prepare list of students for saving
        List<Student> studentsToSave = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentsToSave.add((Student) p);
            }
        }

        // Save students to file
        FileStorageService.saveData(studentsToSave, "students.txt");
    }
}

