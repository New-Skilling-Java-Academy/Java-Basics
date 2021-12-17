package com.company;

public class Exercise3 {
    // EXERCISE 3
    // With a matrix of Random Numbers
    // Sum and display the value of each row
    // 2  5  3  2 = 12
    // 1  5  3  2 = 11
    // 2  1  3  1 = 7
    // 2  5  1  2 = 10

    // BONUS
    // Add + signs between the numbers
    // 2  + 5  + 3  +  2 = 12
    // 1  + 5  + 3  +  2 = 11
    // 2  + 1  + 3  +  1 = 7
    // 2  + 5  + 1  +  2 = 10

    // BONUS 2
    // Sum the columns as well
    // 2  + 5  + 3  +  2 = 12
    // 1  + 5  + 3  +  2 = 11
    // 2  + 1  + 3  +  1 = 7
    // 2  + 5  + 1  +  2 = 10
    // --------------------
    // 7   16  10      7


    public static void main(String[] args) {
        int[][] matrix = Main.createRandomMatrix(3, 2);

        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (col > 0) {
                    System.out.print(" +");
                }
                System.out.printf(" %2d", matrix[row][col]);

                total += matrix[row][col];
            }
            System.out.println(" = " + total);
        }

        System.out.println("  ---------------------");

        int[] totalCol = new int[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                totalCol[col] += matrix[row][col];
            }
        }

        for (int i = 0; i < totalCol.length; i++) {
            System.out.printf("%3d", totalCol[i]);
        }

    }
}
