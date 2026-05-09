package Enrollment;

public class Student extends Person {
    private String program;

    public Student() {
    }

    public Student(String personName, String personID, String program) {
        super(personName, personID);
        this.program = program;
    }

    public void setName(String name) {
        setPersonName(name);
    }

    public String getName() {
        return getPersonName();
    }

    public void setStudentID(int id) {
        setPersonID(String.valueOf(id));
    }

    public String getStudentID() {
        return getPersonID();
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }
}