package com.shamimsir.lab6.prob1;

public class Sphere extends Shape {

    @Override
    double getArea(double input) {
        return (4 * Math.PI * input * input);
    }

    @Override
    double getVolume(double input) {
        return ((4 / 3.0) * Math.PI * Math.pow(input, 3));
    }
}
