package org.example.model;

public class Person {
    private String personName;
    private String personID;

    public Person() {
    }

    public Person(String personName, String personID) {
        this.personName = personName;
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
}