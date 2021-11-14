package com.shamimsir.lab6.prob2;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        System.out.println(hourlyEmployee.getAmount(25, 250));


        WeeklyEmployee weeklyEmployee = new WeeklyEmployee();
        System.out.println(weeklyEmployee.getAmount(2500, 4));


    }
}
