package com.shamimsir.lab5.prob4;

public class TwoWheeler extends Vehicle {

    public void maintenance(double maintenance) {
        System.out.println("Maintenance cost: " + maintenance);
    }

    public void average(double avg) {
        System.out.println("Average: " + avg);
    }

    public String getType(String type) {
        return type;
    }

    public String getName(String name) {
        return name;
    }

}
