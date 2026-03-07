package org.example.model;

public class Student extends Person{
    private String program;
    public Student() {

    }
    public Student(String personName, String personID, String program){
        super(personName,personID);
        this.program = program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
}