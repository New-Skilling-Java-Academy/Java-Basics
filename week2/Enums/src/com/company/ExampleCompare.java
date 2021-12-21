package com.company;

public class ExampleCompare {

    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        ComparisonResult result = compareTwoNumbers(a, b);
        System.out.println(result);
    }

    public static ComparisonResult compareTwoNumbers(int a, int b) {
        if (a > b) {
            return ComparisonResult.HIGHER;
        } else if (a < b) {
            return ComparisonResult.LOWER;
        } else {
            return ComparisonResult.EQUAL;
        }
    }
}
