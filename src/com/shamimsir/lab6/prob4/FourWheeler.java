package com.shamimsir.lab6.prob4;

public class FourWheeler implements Vehicle {
    @Override
    public String getColor(String color) {
        return color;
    }

    @Override
    public int getNumber(int numOfVeh) {
        return numOfVeh;
    }

    @Override
    public double getConsumption(double fuelCost) {
        return fuelCost;
    }
}
