package Enrollment;

public class Instructor extends Person {
    private String course;

    public Instructor() {
    }

    public Instructor(String personName, String personID, String course) {
        super(personName, personID);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}