package com.shamimsir.lab4;

class Student {
    int id;
    String name, mobile;

//    public Student(int id, String name, String mobile) {
//        this.id = id;
//        this.name = name;
//        this.mobile = mobile;
//    }

    public void show() {
        System.out.println("Id: " + id + "\nName: " + name + "\nMobile: " + mobile);
    }
}

public class Person {
    public static void main(String[] args) {
//        Student studentObj = new Student(19016, "Tanver", "Ahammed");    // initialize using constructor
        Student studentObj = new Student();
        studentObj.id = 19016;
        studentObj.name = "Tanver Ahammed";
        studentObj.mobile = "+8801818586035";
        studentObj.show();
    }
}
