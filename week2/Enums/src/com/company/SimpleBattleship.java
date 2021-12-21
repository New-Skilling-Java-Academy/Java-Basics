package com.company;

import java.util.Scanner;

public class SimpleBattleship {

    public static void main(String[] args) {
        int[][] field = {
                {2, 2, 0, 3, 0, 0, 4, 4, 4, 4},
                {0, 0, 0, 3, 0, 0, 0, 0, 0, 0},
                {4, 0, 0, 3, 0, 3, 3, 3, 0, 2},
                {4, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {4, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {4, 0, 0, 0, 0, 2, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 2, 0, 0, 0, 3},
                {2, 2, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 6, 6, 6, 6, 6}
        };

        Target[][] targetField = new Target[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                switch (field[i][j]) {
                    case 0:
                        targetField[i][j] = Target.WATER;
                        break;
                    case 2:
                        targetField[i][j] = Target.DINGY;
                        break;
                    case 3:
                        targetField[i][j] = Target.SUBMARINE;
                        break;
                    case 4:
                        targetField[i][j] = Target.BOAT;
                        break;
                    case 6:
                        targetField[i][j] = Target.BATTLESHIP;
                        break;
                }
            }
        }


        Scanner input = new Scanner(System.in);

        System.out.println("What Row? (1 -> 10)");
        int row = input.nextInt();

        System.out.println("What Col? (1 -> 10)");
        int col = input.nextInt();

        // Let's fix the user input to zero based (because of like... arrays)
        row--;
        col--;


        Target value = targetField[row][col];

        if (value == Target.WATER) {
            System.out.printf("You hit %s\n", Target.WATER);
        } else if (value == Target.DINGY) {
            System.out.println("You hit a Dingy. Feel like a big man do you?");
        } else if (value == Target.SUBMARINE) {
            System.out.println("You hit a Submarine.");
        } else if (value == Target.BOAT) {
            System.out.println("You hit a Boat.");
        } else if (value == Target.BATTLESHIP) {
            System.out.println("You hit a Battleship.");
        } else {
            System.out.println("You hit something... I'm not quite sure what");
        }


    }

}
