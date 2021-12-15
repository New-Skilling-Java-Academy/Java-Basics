package com.company;

import java.util.Arrays;

public class QuizDraft {
    public static void main(String[] args) {

        String text = "Java";
        for (int i = 1; i < text.length(); i++) {
            System.out.print(text.charAt(i) + "\n");
        }

    }


    public static String myMethod() {
        return "Java is Awesome!";
    }
}
