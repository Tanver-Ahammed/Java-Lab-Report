package com.shamimsir.lab6.prob1;

public class Cube extends Shape {
    @Override
    double getArea(double input) {
        return (6 * Math.pow(input, 2));
    }

    @Override
    double getVolume(double input) {
        return Math.pow(input, 3);
    }
}
