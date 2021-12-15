package com.company;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        // EXERCISE 3
        // Ask the user for 5 numbers
        // Print only the highest number

        Scanner input = new Scanner(System.in);

//        int[] numbers = { 0, 0, 0, 0, 0 };
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i ++) {
            System.out.println("Give me number " + (i + 1));
            numbers[i] = input.nextInt();
        }

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);

//        int highest = Integer.MIN_VALUE;
        int highest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            System.out.printf("%d: %d\n", i, numbers[i]);

            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            System.out.printf("Current Highest: %d\n", highest);
        }
        System.out.println(highest);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
    }
}
