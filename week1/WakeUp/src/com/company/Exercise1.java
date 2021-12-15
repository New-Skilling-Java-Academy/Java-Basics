package com.company;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
	    // EXERCISE 1
        // Ask the user for 2 numbers
        // Print only the highest number

        Scanner input = new Scanner(System.in);
        System.out.println("First number?");
        int a = input.nextInt();

        System.out.println("Second number?");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("The highest number is " + a);
        } else {
            System.out.println("The highest number is " + b);
        }






    }
}
