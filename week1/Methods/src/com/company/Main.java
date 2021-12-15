package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            myAwesomeFunction();
            myAwesomeFunction();
        }
    }

    public static void myAwesomeFunction() {
        System.out.println("This is my Awesome Function!");
        System.out.println("It Does Awesome Things...");
    }
}
