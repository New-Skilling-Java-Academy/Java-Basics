package com.company;

import java.util.Scanner;

public class TestKatalin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your firstName: ");
        String firstName = scan.nextLine();
//        System.out.println("Please enter your lastName: ");
        String lastName = scan.nextLine();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println(firstName + lastName + " is " + age + "years old.");
    }
}
