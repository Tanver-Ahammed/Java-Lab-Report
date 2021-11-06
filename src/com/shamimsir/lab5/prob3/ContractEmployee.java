package com.shamimsir.lab5.prob3;

public class ContractEmployee extends Employee {
    private String department, designation;
    private double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayFullName() {
        System.out.println("Full Name is: " + this.getFirstName() + " " + this.getLastName());
    }
}
