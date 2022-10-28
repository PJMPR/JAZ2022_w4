package org.example.model;

public class Employee extends Person{

    double income;

    public Employee() {
        this(0);
    }

    public Employee(double income) {
        this("","", 0);
        this.income = income;
    }

    public Employee(String firstname, String lastname, double income) {
        super(firstname, lastname);
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    private void secretAction(){
        System.out.println("I do something in secret...");
    }
}
