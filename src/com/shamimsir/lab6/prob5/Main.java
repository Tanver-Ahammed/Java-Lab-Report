package com.shamimsir.lab6.prob5;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        System.out.println("Cost of Bus: " + bus.getAmount(2500.00));

        Train train = new Train();
        System.out.println("Cost of Train: " + train.getAmount(1500.00));

    }
}
