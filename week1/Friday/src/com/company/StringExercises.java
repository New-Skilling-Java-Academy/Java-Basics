package com.company;

public class StringExercises {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < 20; i++) {
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.println(nextNumber);
            int[] a = {nextNumber};
            System.out.println(a[i]);
        }


        // Letter Counter:
        // Ask the user for a word
        // Ask the user for a letter
        // Show how many times the letter shows up in the word

        // Dash It up:
        // Ask the user for a word
        // Print the word with dashes:
        // Hello
        // H-e-l-l-o

        // Reverse:
        // Ask the user for a word
        // Print the word in reverse:
        // Hello
        // olleH

        // Palindrome:
        // Ask the user for a word
        // Tell the user if it's a palindrome or not:
        // bob

        // Bonus Palindrome:
        // Excuse spaces and capital letters
        // Taco Cat
    }
}
