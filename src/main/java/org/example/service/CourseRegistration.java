package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void displayAll() {
        for (Course course : courseList) {
            System.out.println(
                    "Course ID: " + course.getCourseID() +
                            " | Course: " + course.getCourseName() +
                            " | Program: " + course.getProgram()
            );
        }
    }
}