package com.dtag.prestudies.week2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int guessingNumber = ThreadLocalRandom.current().nextInt(1, 101);

        // We Cheat...
        int guessingNumber = 10;
        System.out.println(guessingNumber);

        System.out.println("What's your guess?");
        int userNumber = input.nextInt();

        while (guessingNumber != userNumber) {
            if (userNumber > guessingNumber) {
                System.out.println("Your number is too High!");
            } else {
                System.out.println("Your number is too Low!");
            }
            System.out.println("Try Again!");
            userNumber = input.nextInt();
        }

        System.out.println("YAY You're Awesome!!!!!");
    }

}
