package com.company;

import java.util.Scanner;

public class Geometry2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the width of the rectangle?");
        int width = input.nextInt();

        System.out.println("What's the height of the rectangle?");
        int height = input.nextInt();

        int perimeter = rectanglePerimeter(width, height);

        System.out.printf("The perimeter of your %dx%d rectangle is %d\n",
                width, height, perimeter);

        int x = 2;

        int sideA = squareArea(x);
        int sideB = squareArea(x);
        int p = rectanglePerimeter(sideA, sideB);

        System.out.println(p);

    }

    public static int rectanglePerimeter(int width, int height) {
        return (width + height) * 2;
    }

    public static int rectangleArea(int width, int height) {
        return width * height;
    }

    public static double circlePerimeter(int radius) {
        return radius * 2 * Math.PI;
    }

    public static double circleArea(int radius) {
        return radius * radius * Math.PI;
    }

    public static int squarePerimeter(int side) {
        return rectanglePerimeter(side, side);
    }

    public static int squareArea(int side) {
        return rectangleArea(side, side);
    }
}
