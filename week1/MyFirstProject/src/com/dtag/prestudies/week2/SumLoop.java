package com.dtag.prestudies.week2;

public class SumLoop {
    public static void main(String[] args) {

        int[] numbers = { 3, 1, 5, -4, 20, 14, 21 };

        int total = 0;
        for (int number: numbers) {
            System.out.println(number);
            total += number;
            System.out.println("Current total : " + total);
        }

        System.out.println("----");
        System.out.println(total);

    }
}
