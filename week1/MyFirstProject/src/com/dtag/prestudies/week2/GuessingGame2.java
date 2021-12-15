package com.dtag.prestudies.week2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int guessingNumber = ThreadLocalRandom.current().nextInt(1, 101);

        // We Cheat...
        int guessingNumber = 10;
        System.out.println(guessingNumber);

        int userNumber;
        int counter = 0;

        do {
            if (counter == 10) {
                break;
            }

            System.out.println("What's your guess?");
            userNumber = input.nextInt();
            counter++;

            if (userNumber > guessingNumber) {
                System.out.println("TOO HIGH!");
            } else if (userNumber < guessingNumber) {
                System.out.println("TOO LOW!");
            }

        } while(guessingNumber != userNumber);

        if (counter == 10) {
            System.out.println("You Suck!!!!!!");
        } else {
            System.out.println("YAY You're Awesome!!!!!");
        }

    }

}
