package com.company;

import java.util.Scanner;

public class StringExercise1 {

    public static void main(String[] args) {
        // Letter Counter:
        // Ask the user for a word
        // Ask the user for a letter
        // Show how many times the letter shows up in the word

//        String sentence = "Welcome to Academy";
//        char letter = 't';

        Scanner input = new Scanner(System.in);
        System.out.println("Sentecen?");
        String sentence = input.nextLine();

        System.out.println("Letter?");
        String inputLetter = input.nextLine();
        char letter = inputLetter.charAt(0);

        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
//            System.out.println(sentence.charAt(i));
            if (sentence.charAt(i) == letter) {
                counter++;
            }
        }

        System.out.printf("The sentence `%s` has the letter `%c` %d time(s)", sentence, letter, counter);

    }

}
