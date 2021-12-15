package com.dtag.prestudies.week2;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How large should the triangles be?");
        int size = input.nextInt();

        System.out.println("How many triangles would you like?");
        int numberOfTriangles = input.nextInt();

        input.nextLine();

        System.out.println("What should they be made of?");
        String character = input.nextLine();


        for (int i = 0; i < numberOfTriangles; i++) {
            drawTriangle(size, character);
            System.out.println();
        }
    }

    public static String line(int counter, String character) {
//        String newLine = "";
//        for (int i = 0; i < counter; i++) {
//            newLine += "*";
//        }
//        return newLine;
        return character.repeat(counter);
    }

    public static void drawLine(int counter, String character) {
        System.out.println(line(counter, character));
    }

    public static void drawTriangle(int size, String character) {
        for (int i = 1; i <= size; i++) {
            drawLine(i, character);
        }
    }
}
