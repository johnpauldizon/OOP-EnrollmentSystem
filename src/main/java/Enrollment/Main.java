package Enrollment;

import org.example.model.Student;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import org.example.service.TuitionFeePayment;
import org.example.model.Course;

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
    }
}
