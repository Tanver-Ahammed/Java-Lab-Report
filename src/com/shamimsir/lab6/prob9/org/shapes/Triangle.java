package com.shamimsir.lab6.prob9.org.shapes;

public class Triangle extends Shapes {

    @Override
    public double area(double input) {
        return Math.sqrt(3) / 4 * Math.pow(input, 2);
    }

}
