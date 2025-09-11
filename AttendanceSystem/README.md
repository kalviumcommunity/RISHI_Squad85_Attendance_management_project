# School Management System

## Part-05: Inheritance Hierarchy (Students, Teachers & Staff)

In this part of the project, we implemented an **Object-Oriented inheritance structure** using a `Person` base class and derived classes `Student`, `Teacher`, and `Staff`.

### Features
- `Person`  
  - Auto-generated unique ID for each object  
  - Common fields: `id`, `name`  
  - Method: `displayDetails()`  

- `Student` (extends `Person`)  
  - Field: `gradeLevel`  
  - Overrides `displayDetails()` to include grade level and role  

- `Teacher` (extends `Person`)  
  - Field: `subjectTaught`  
  - Overrides `displayDetails()` to include subject taught and role  

- `Staff` (extends `Person`)  
  - Field: `role`  
  - Overrides `displayDetails()` to include staff role and position  

### Sample Code (Main.java)
```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
        System.out.println();
        staff.displayDetails();
        System.out.println();

        // Example usage in AttendanceRecord
        System.out.println("Attendance marked for Student ID: " + student.getId());
    }
}
