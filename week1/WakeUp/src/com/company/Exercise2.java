package com.company;

public class Exercise2 {

    public static void main(String[] args) {
        // EXERCISE 2
        // Ask the user for 3 numbers
        // Print only the highest number

        // TODO: Ask the user for input
        int a = -3;
        int b = -35;
        int c = -1;

//        if (a > b) {
//            if (a > c) {
//                System.out.println(a);
//            } else {
//                System.out.println(c);
//            }
//        } else {
//            if (b > c) {
//                System.out.println(b);
//            } else {
//                System.out.println(c);
//            }
//        }

        int highest = a;

        if (b > highest) {
            highest = b;
        }

        if (c > highest) {
            highest = c;
        }

        System.out.println(highest);
    }

}
