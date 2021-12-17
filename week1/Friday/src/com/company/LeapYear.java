package com.company;

public class LeapYear {

    public static void main(String[] args) {

//        int year = 2004;
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("It's a leap year");
//                } else {
//                    System.out.println("It's not a leap year");
//                }
//            } else {
//                System.out.println("It's a leap year");
//            }
//        } else {
//            System.out.println("It's not a leap year");
//        }
        for (int i = 1600; i <= 2600; i++) {
//            System.out.printf("%d: %b\n", i, isLeapYear(i));
            if (isLeapYear(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
