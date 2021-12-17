package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Scope {

    public static void main(String[] args) {

        System.out.println("Hello, Welcome to this Awesome app!");

//        int number = 5;
//        int x = 0;
//
//        if (number > 2) {
//            x = 20;
//            number = 10;
//            if (number > 3) {
//                x = 34;
//            }
//        }
//        System.out.println(x);
//
//        System.out.println(number);

//        int a = 10;
//
//        circleArea(a);
//
//        a = someFunction(a);
//
//        System.out.println(a);

        int[] n = {0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(n));

        someOtherFunction(n);

        System.out.println(Arrays.toString(n));
    }

    public static void someOtherFunction(int[] numbers) {
        numbers[2] = 10;
    }

    public static int someFunction(int someNumber) {
        someNumber = 20;
        return someNumber;
    }

    public static double circleArea(int radius) {
        double result = radius * radius * Math.PI;
        return result;
    }

}
