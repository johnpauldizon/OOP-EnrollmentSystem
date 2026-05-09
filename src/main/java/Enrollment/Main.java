package Enrollment;

import org.example.model.Student;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import org.example.service.TuitionFeePayment;
import org.example.model.Course;
import org.example.model.Section;
import org.example.service.EnrollmentService;

public class Main {

    public static void main(String[] args) {

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();
        TuitionFeePayment tuitionFeePayment = new TuitionFeePayment();

// Add students
        studentRegistration.addStudent(new Student("Dante", "2023", "IT"));
        studentRegistration.addStudent(new Student("Vergil", "2024", "CS"));

// Add courses
        courseRegistration.addCourse(new Course("01", "Interprog", "IT"));
        courseRegistration.addCourse(new Course("02", "ITSyde", "CS"));

// Display only once
        System.out.println("=== STUDENTS ===");
        studentRegistration.displayAll();

        System.out.println("\n=== COURSES ===");
        courseRegistration.displayAll();

// Tuition
        double fee = tuitionFeePayment.calculateTuition(2);
        tuitionFeePayment.makePayment(10000);

        System.out.println("\n=== TUITION ===");
        System.out.println("Total Fee: " + fee);
        System.out.println("Balance: " + tuitionFeePayment.getBalance());
        System.out.println("Fully Paid: " + tuitionFeePayment.isFullyPaid());

        Section section = new Section("BSIT-1A", 2);
        EnrollmentService enrollmentService = new EnrollmentService();

        Student s1 = new Student("Dante", "2023", "IT");
        Student s2 = new Student("Vergil", "2024", "CS");
        Student s3 = new Student("Nero", "2025", "IT");

        System.out.println("\n=== ENROLLMENT ===");

        System.out.println("Enroll Dante: " +
                enrollmentService.enrollStudentInSection(s1, section));

        System.out.println("Enroll Vergil: " +
                enrollmentService.enrollStudentInSection(s2, section));

        System.out.println("Enroll Nero: " +
                enrollmentService.enrollStudentInSection(s3, section));
        System.out.println("\n=== SECTION VIEW ===");
        System.out.println("Section: " + section.getSectionName());

        for (Student student : section.getEnrolledStudents()) {
            System.out.println("Student: " + student.getPersonName());
        }
    }
}
