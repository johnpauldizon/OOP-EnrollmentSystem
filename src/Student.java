package org.example.model;

public class Student {

    private int studentID;
    private String studentName;
    private String studentProgram;


    public Student() {
    }

    // Parameterized constructor
    public Student(int studentID, String studentName, String studentProgram) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentProgram = studentProgram;
    }

    // Getter and Setter for studentID
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for studentProgram
    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }
}


