package com.shamimsir.lab6.prob6;

public class Main {
    public static void main(String[] args) {

        Hostler hostler = new Hostler();
        System.out.println("For Hostler:\n" + hostler.getAmount(2500));
        System.out.println(hostler.getFirstName("Tanver"));
        System.out.println(hostler.getLastName("Ahammed"));
        System.out.println(hostler.getAddress("Joypurhat"));
        System.out.println(hostler.getContact("+8850716465"));

        NonHostler nonHostler = new NonHostler();
        System.out.println("\nFor NonHostler:\n" + nonHostler.getAmount(2500));
        System.out.println(nonHostler.getFirstName("Tanver"));
        System.out.println(nonHostler.getLastName("Ahammed"));
        System.out.println(nonHostler.getAddress("Joypurhat"));
        System.out.println(nonHostler.getContact("+8850716465"));

    }
}
