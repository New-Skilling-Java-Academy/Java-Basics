package com.dtag.prestudies.week2;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How large should the triangles be?");
        int size = input.nextInt();
        System.out.println("How many triangles would you like?");
        int numberOfTriangles = input.nextInt();

        for (int i = 0; i < numberOfTriangles; i++) {
            drawTriangle(size);
        }
    }

    public static String line(int counter) {
        String newLine = "";
        for (int i = 0; i < counter; i++) {
            newLine += "*";
        }
        return newLine;
    }

    public static void drawLine(int counter) {
        System.out.println(line(counter));
    }

    public static void drawTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            drawLine(i);
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
}
