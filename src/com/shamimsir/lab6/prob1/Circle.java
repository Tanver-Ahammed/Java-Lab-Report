package com.shamimsir.lab6.prob1;

public class Circle extends Shape {

    @Override
    double getArea(double input) {
        return (Math.PI * Math.pow(input, 2));
    }

    @Override
    double getVolume(double input) {
        return (-1);
    }

}
