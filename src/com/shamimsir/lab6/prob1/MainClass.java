package com.shamimsir.lab6.prob1;

public class MainClass {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.getArea(5));
        System.out.println(circle.getVolume(5));

        Cube cube = new Cube();
        System.out.println(cube.getArea(2));
        System.out.println(cube.getVolume(2));

        Square square = new Square();
        System.out.println(square.getArea(2));
        System.out.println(square.getVolume(2));

        Sphere sphere = new Sphere();
        System.out.println(sphere.getArea(2));
        System.out.println(sphere.getVolume(2));
    }
}
