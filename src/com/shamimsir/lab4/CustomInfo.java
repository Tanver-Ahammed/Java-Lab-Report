package com.shamimsir.lab4;

class Customer {
    int customerId;
    String customerName, customerMobile;

    public Customer(int customerId, String customerName, String customerMobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
    }

    public void display() {
        System.out.println("Customer Id: " + customerId + "\nCustomer Name: "
                + customerName + "\nCustomer Mobile: " + customerMobile);
    }
}

public class CustomInfo {
    public static void main(String[] args) {
        // the variable initialize variable using constructor
        Customer customerObj = new Customer(101, "Aminul Bari", "++80645646");
        customerObj.display();
    }
}
