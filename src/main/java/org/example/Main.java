package org.example;
import java.util.*;

public class Main{
    public static void man(String[]args) {
        Scanner scan = new Scanner(System.in);
        Student student1 = new Student();
        student.setName("John Doe");
        student.setStudentID(000123);
        student.setProgram("Information Technology");

        Course cor = new Course();
        cor.setCourseID(00001);
        cor.setCourseName("Integrative Programming");
        cor.SetProgram("Information Technology");

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Course ID: " + cor.getCourseID());
        System.out.println("Course Name: " + cor.getCourseName());
        System.out.println("Program: " + cor.getProgram());
    }
}
