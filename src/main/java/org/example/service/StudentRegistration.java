package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayAll() {
        for (Student student : studentList) {
            System.out.println(
                    "Name: " + student.getPersonName() +
                            " | ID: " + student.getPersonID() +
                            " | Program: " + student.getProgram()
            );
        }
    }
}