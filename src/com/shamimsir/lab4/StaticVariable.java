package com.shamimsir.lab4;

class StaticExample {
    static String firstName, lastName, mobile;

    public void display() {
        System.out.println("First Name: " + firstName + "\nLast name: " + lastName + "\nMobile: " + mobile);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        StaticExample staticExampleObj = new StaticExample();
        StaticExample.firstName = "Tanver";
        StaticExample.lastName = "Ahammed";
        StaticExample.mobile = "+8802416556";
        staticExampleObj.display();
    }
}
