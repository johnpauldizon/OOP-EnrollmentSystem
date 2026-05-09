package Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setStudentID(123);
        student.setProgram("Information Technology");

        Course course = new Course();
        course.setCourseID(1);
        course.setCourseName("Integrative Programming");
        course.setProgram("Information Technology");

        Instructor instructor = new Instructor();
        instructor.setPersonName("Prof. Santos");
        instructor.setPersonID("INS001");
        instructor.setCourse("Integrative Programming");

        System.out.println("=== ENROLLMENT SYSTEM ===");
        System.out.println();

        System.out.println("Student Information");
        System.out.println("ID: " + student.getStudentID());
        System.out.println("Name: " + student.getName());
        System.out.println("Program: " + student.getProgram());
        System.out.println();

        System.out.println("Course Information");
        System.out.println("Course ID: " + course.getCourseID());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Program: " + course.getProgram());
        System.out.println();

        System.out.println("Instructor Information");
        System.out.println("ID: " + instructor.getPersonID());
        System.out.println("Name: " + instructor.getPersonName());
        System.out.println("Course: " + instructor.getCourse());
    }
}