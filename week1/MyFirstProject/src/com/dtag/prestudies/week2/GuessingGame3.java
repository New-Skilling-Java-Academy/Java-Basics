package com.dtag.prestudies.week2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int guessingNumber = ThreadLocalRandom.current().nextInt(1, 101);
        // We Cheat...
//        int guessingNumber = 10;
//        System.out.println(guessingNumber);

        int userNumber;
        boolean userHasWon = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("What's your guess?");
            userNumber = input.nextInt();

            if (userNumber > guessingNumber) {
                System.out.println("TOO HIGH!");
            } else if (userNumber < guessingNumber) {
                System.out.println("TOO LOW!");
            } else {
                userHasWon = true;
                break;
            }
        }

        if (userHasWon) {
            System.out.println("YOU'RE AWESOME 😎");
        } else {
            System.out.println("YOU SUCK 💩");
        }

    }
}
