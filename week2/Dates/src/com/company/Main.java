package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;

public class Main {

    public static void main(String[] args) {

//        LocalDate today = LocalDate.now();
//        LocalDate xmasDay = LocalDate.of(2021, 12, 25);
//
//        LocalTime rightNow = LocalTime.now();
//        LocalTime lunchTime = LocalTime.of(12, 0);

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        // Exercise:
        // 1 - create an application that tells the user if it's morning or afternoon
        // 2 - tell the user what day of the week it is

        // Exercise 1 solution 1
//        LocalTime currentTime = LocalTime.now();
//        if (currentTime.getHour() >= 12) {
//            System.out.println("It's Afternoon");
//        } else {
//            System.out.println("It's Morning");
//        }


        // Exercise 1 solution 2
//        LocalTime currentTime = LocalTime.now();
//        LocalTime noon = LocalTime.of(12, 0);
//
//        if (currentTime.isAfter(noon)) {
//            System.out.println("It's Afternoon");
//        } else {
//            System.out.println("It's Morning");
//        }

        // Exercise 2
        LocalDate currentDate = LocalDate.now();
        DayOfWeek weekDay = currentDate.getDayOfWeek();

        if (weekDay == DayOfWeek.TUESDAY) {
            System.out.println("JAVA TIME!!!!!!");
        }
    }
}
