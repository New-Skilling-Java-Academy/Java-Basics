package com.company;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateCalc {

    public static void main(String[] args) {

//        Duration
//        Period

        LocalDate today = LocalDate.now();
        LocalDate xmasDay = LocalDate.of(2021, 12, 25);

        Period daysUntilXmas = Period.between(today, xmasDay);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime xmasMorning = LocalDateTime.of(2021, 12, 25, 0, 0);

        Duration secondsUntilXmas = Duration.between(now, xmasMorning);
        System.out.println(secondsUntilXmas.getSeconds() / 60 / 60 / 24);
    }

}
