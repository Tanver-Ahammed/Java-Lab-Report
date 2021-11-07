package com.shamimsir.lab6.prob4;

public class Main {
    public static void main(String[] args) {

        TwoWheeler twoWheeler = new TwoWheeler();
        System.out.println("For Two Wheeler Vehicle:\n" + twoWheeler.getColor("Red"));
        System.out.println(twoWheeler.getNumber(10));
        System.out.println(twoWheeler.getConsumption(2550.00));


        FourWheeler fourWheeler = new FourWheeler();
        System.out.println("\nFor Two Wheeler Vehicle:\n" + fourWheeler.getColor("Yellow"));
        System.out.println(fourWheeler.getNumber(5));
        System.out.println(fourWheeler.getConsumption(5500.00));


    }
}
