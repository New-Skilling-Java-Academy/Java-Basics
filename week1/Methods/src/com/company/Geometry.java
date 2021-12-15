package com.company;

public class Geometry {

    public static void main(String[] args) {
        // Simple Geometry
        // Create 4 functions

        // 1 - Calculate the perimeter of a rectangle
        // 2 - Calculate the area of a rectangle
        // 3 - Calculate the perimeter of a circle (circumference)
        // 4 - Calculate the area of a circle

        rectanglePerimeter(10, 10);
        rectangleArea(10, 10);
        circlePerimeter(5);
        circleArea(5);
        squarePerimeter(5);
        squareArea(5);
    }

    public static void rectanglePerimeter(int width, int height) {
//        int result = width + width + height + height;
//        int result = width * 2 + height * 2;
        int result = (width + height) * 2;

        System.out.println("The perimeter is " + result);
    }

    public static void rectangleArea(int width, int height) {
        int result = width * height;

        System.out.println("The area is " + result);
    }

    public static void circlePerimeter(int radius) {
        double result = radius * 2 * Math.PI;

        System.out.println("The circumference is " + result);
    }

    public static void circleArea(int radius) {
//        double result = Math.pow(radius, 2) * Math.PI;
        double result = radius * radius * Math.PI;

        System.out.println("The area is " + result);
    }

    public static void squarePerimeter(int side) {
        rectanglePerimeter(side, side);
    }

    public static void squareArea(int side) {
        rectangleArea(side, side);
    }
}
