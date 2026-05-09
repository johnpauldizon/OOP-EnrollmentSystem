package org.example.service;

import org.example.model.Section;
import org.example.model.Student;

public class EnrollmentService {

    public boolean enrollStudentInSection(Student student, Section section) {
        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            return false;
        }

        section.getEnrolledStudents().add(student);
        return true;
    }
}