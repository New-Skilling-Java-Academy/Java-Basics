package com.dtag.prestudies.week1;

public class TimeUnits {

    public static void main(String[] args) {

//        // TODO: ask the user for input later... maybe with Scanner
//        int a = 10;
//        int b = 4;
//
//        int sum = a + b;
//        int sub = a - b;
//        int mult = a * b;
//        double divi = (double)a / b;
//        int mod = a % b;
//
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mult);
//        System.out.println(divi);
//        System.out.println(mod);

        // TODO: ask the user for input later... maybe with Scanner
        int seconds = 244568879;

        int numberOfYears = seconds / 60 / 60 / 24 / 365;
        int numberOfDays = seconds / 60 / 60 / 24 % 365;
        int numberOfHours = seconds / 60 / 60 % 24;
        int numberOfMinutes = seconds / 60 % 60;
        int numberOfSeconds = seconds % 60;

//        String result = numberOfYears + " years and " + numberOfDays + " days and " + numberOfHours +
//                " hours and " + numberOfMinutes + " minutes and " + numberOfSeconds + " seconds";

        String result = String.format("%d years and %d days and %d hours and %d minutes and %d seconds",
                numberOfYears,
                numberOfDays,
                numberOfHours,
                numberOfMinutes,
                numberOfSeconds);

        System.out.println(result);

    }

}
