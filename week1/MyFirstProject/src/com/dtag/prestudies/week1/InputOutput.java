package com.dtag.prestudies.week1;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.nextLine();

        // CONCATENATION
//        String greeting = "Hello " + name + " Welcome to Academy";

        // STRING FORMATTING
        String greeting = String.format("Hello %s Welcome to Academy", name);

        System.out.println(greeting);
    }

}
