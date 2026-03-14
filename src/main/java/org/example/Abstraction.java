package org.Abstraction;

public abstract class Person {

    // Fields
    private String personID;
    private String personName;


    public Person() {
    }

    public Person(String personID, String personName) {
        this.personID = personID;
        this.personName = personName;
    }

    // Getters
    public String getPersonID() {
        return personID;
    }

    public String getPersonName() {
        return personName;
    }

    // Setters
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    // Abstract method
    public abstract void mainTask();
}