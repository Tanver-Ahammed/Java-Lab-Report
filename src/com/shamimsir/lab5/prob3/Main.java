package com.shamimsir.lab5.prob3;

public class Main {
    public static void main(String[] args) {

        // ContractEmployee
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setFirstName("Tanver");
        contractEmployee.setLastName("Ahammed");
        contractEmployee.setDepartment("ICT");
        contractEmployee.setSalary(75000.0);
        contractEmployee.setDesignation("Java Developer");

        contractEmployee.displayFullName();

        // HourlyEmployee
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setNumberOfHours(50);
        hourlyEmployee.setWagesPerHour(50);
        System.out.println(hourlyEmployee.calculateWages());


    }
}
