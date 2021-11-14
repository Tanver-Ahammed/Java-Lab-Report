package com.shamimsir.lab6.prob1;

public class Square extends Shape {
    @Override
    double getArea(double input) {
        return (6 * Math.pow(input, 2));
    }

    @Override
    double getVolume(double input) {
//        return (4 / 3.0 * Math.PI * Math.pow(input, 3));
        return (-1);
    }
}
