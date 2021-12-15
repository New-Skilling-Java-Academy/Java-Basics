package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Jakub Zięba",
//                "Szymon Jędrzejczak",
//                "Krzysztof Buczek",
//                "Mathias Radke",
//                "Henry Schultz",
//                "Sebastian Alaimo Di Loro",
//                "Balázs Hermann",
//                "Katalin Kiss",
//                "Elena Dimovska Savevska",
//                "Stefan Nikolovski",
//                "Filip Dzambazov",
//                "Kjirko Risteski",
//                "Bojan Stojanovski",
//                "Leonard Žarinčić",
//                "Boris Bellford",
//                "Kristijan Perić",
//                "Luka Radnić",
//                "Melani Kamenar",
//                "Josipa Majić"
//        ));

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Jakub",
                "Szymon",
                "Krzysztof",
                "Mathias",
                "Henry",
                "Sebastian",
                "Balázs",
                "Katalin",
                "Elena",
                "Stefan",
                "Filip",
                "Kjirko",
                "Bojan",
                "Leonard",
                "Boris",
                "Kristijan",
                "Luka",
                "Melani",
                "Josipa"
        ));

        int numberOfGroups = 5;

        ArrayList<String>[] groups = new ArrayList[numberOfGroups];

        int counter = 0;
        while (names.size() > 0) {
            int randomIndex = ThreadLocalRandom.current().nextInt(names.size());
            String name = names.remove(randomIndex);

            if (counter == numberOfGroups) {
                counter = 0;
            }

            if (groups[counter] == null) {
                groups[counter] = new ArrayList<>();
            }
            groups[counter].add(name);

            counter ++;
        }

        for (int i = 0; i < groups.length; i++) {
            System.out.printf("\nGroup %d%n", i + 1);
            System.out.println(groups[i]);
        }

    }
}
