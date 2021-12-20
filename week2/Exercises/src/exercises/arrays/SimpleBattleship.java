package exercises.arrays;

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

        // 6 = Battleship
        // 4 = Boat
        // 3 = Submarine
        // 2 = Dingy

        // Ask the user for 2 coordinates
        // Give feedback to the user about which type of Boat they hit or if they missed.

        Scanner input = new Scanner(System.in);

        System.out.println("What Row? (1 -> 10)");
        int row = input.nextInt();

        System.out.println("What Col? (1 -> 10)");
        int col = input.nextInt();

        // Let's fix the user input to zero based (because of like... arrays)
        row--;
        col--;

        int value = field[row][col];

        if (value == 0) {
            System.out.println("That's water... You missed");
        } else if (value == 2) {
            System.out.println("You hit a Dingy. Feel like a big man do you?");
        } else if (value == 3) {
            System.out.println("You hit a Submarine.");
        } else if (value == 4) {
            System.out.println("You hit a Boat.");
        } else if (value == 6) {
            System.out.println("You hit a Battleship.");
        } else {
            System.out.println("You hit something... I'm not quite sure what");
        }


    }

}
