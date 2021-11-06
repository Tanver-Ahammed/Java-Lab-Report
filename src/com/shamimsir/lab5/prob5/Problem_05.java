package com.shamimsir.lab5.prob5;

class CommunityMember {
    private String name, address, contact, date_of_join;

    public CommunityMember(String name, String address, String contact, String date_of_join) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.date_of_join = date_of_join;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getDate_of_join() {
        return date_of_join;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "," +
                "\nAddress: " + getAddress() + "," +
                "\nContact: " + getContact() + "," +
                "\nDate Of Join: " + getDate_of_join();
    }
}

class Employee extends CommunityMember {

    public Employee(String name, String address, String contact, String date_of_join) {
        super(name, address, contact, date_of_join);
    }

}

class Student extends CommunityMember {

    public Student(String name, String address, String contact, String date_of_join) {
        super(name, address, contact, date_of_join);
    }
}

public class Problem_05 {
    public static void main(String[] args) {
        Employee employee = new Employee("Aminul Bari", "Joypurhat", "0571-5665", "03.02.2021");
        Student student = new Student("Tanver Ahammed", "Joypurhat", "0571-516", "04.02.2019");

        System.out.println("Print Employee information:\n" + employee);
        System.out.println("\nPrint Student information:\n" + student);

    }
}
