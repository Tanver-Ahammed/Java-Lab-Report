package com.shamimsir.lab4;

class StaticMethod {
    static String firstName, lastName;
    String mobile;

    /*  Here problem:
     *  object reference is not same, so jvm can't find out the
     *  right reference so, we can see null mobile number.
     *  Here, change object reference so change the object HashCode();
     * */
    public static void display(String mobile) {
        StaticMethod obj = new StaticMethod();
        obj.mobile = mobile;
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName);
        System.out.println("mobile: " + obj.mobile);
    }

    public void show(String mobile) {
        display(mobile);
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        StaticMethod staticMethodObj = new StaticMethod();

        StaticMethod.firstName = "Tanver";
        StaticMethod.lastName = "Ahammed";
        staticMethodObj.show("+88017854");

    }
}
