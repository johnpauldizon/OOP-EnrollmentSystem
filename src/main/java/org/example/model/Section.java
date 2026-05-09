package org.example.model;

import java.util.ArrayList;

public class Section {
    private String sectionName;
    private int maxCapacity;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Section(String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
    }

    public String getSectionName() {
        return sectionName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}