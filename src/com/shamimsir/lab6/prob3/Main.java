package com.shamimsir.lab6.prob3;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();
        System.out.println(invoice.getAmount(40000));

        Employee employee = new Employee();
        System.out.println(employee.getAmount(75000));
    }
}
