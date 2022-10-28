package org.example.model;

import java.time.LocalDate;

public abstract class Person implements IHaveId{

    private long id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void printDetails(){
        System.out.println(details());
    }

    private String details(){
        return "Siema! Jestem " + firstname + " " + lastname;
    }

    public static void print(Employee employee){
        employee.printDetails();
    }
}
