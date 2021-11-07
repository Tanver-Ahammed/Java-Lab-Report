package com.shamimsir.lab6.prob9.org.shapes;

public class Circle extends Shapes {

    @Override
    public double area(double input) {
        return Math.PI * Math.pow(input, 2);
    }

}
