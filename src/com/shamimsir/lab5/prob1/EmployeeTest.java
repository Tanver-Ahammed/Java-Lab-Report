package com.shamimsir.lab5.prob1;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "," +
                "\nLast Name: " + getLastName() + "," +
                "\nSalary: " + getMonthlySalary();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tanver", "Ahammed", 75000);
        Employee employee2 = new Employee("Aminul", "Bari", 72500);

        System.out.println("First Employee:\n" + employee1);
        System.out.println("\nSecond Employee:\n" + employee2);

    }
}
