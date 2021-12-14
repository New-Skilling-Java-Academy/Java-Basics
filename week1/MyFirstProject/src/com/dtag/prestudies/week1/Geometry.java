package com.dtag.prestudies.week1;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("What's the value for a?");
//        int a = input.nextInt();
//
//        System.out.println("What's the value for b?");
//        int b = input.nextInt();

        int a = 7;
        int b = 3;

        double area = a * b / 2.0;
        double hypotenuse = Math.sqrt(a*a + b*b);
//        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + hypotenuse;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The hypotenuse is %.2f\n", hypotenuse);
        System.out.printf("The perimeter is %.2f\n", perimeter);
    }
}
