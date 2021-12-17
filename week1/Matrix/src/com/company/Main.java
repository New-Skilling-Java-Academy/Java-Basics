package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//
//        int[] numbers = {12, 12, 12, 12, 12, 12, 13};
//        String[] names = {"Bob", "Joe", "Martha", "Jen", "Rita"};
//        char[] letters = {'H', 'e', 'l', 'l', 'o'};
//
//        int lastIndex = numbers.length - 1;
//        System.out.println(numbers[lastIndex]);
//        System.out.println(names[0]);
//        System.out.println(letters[1]);
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] randomMatrix = createRandomMatrix(4, 4);
        printMatrixWithComma(randomMatrix);
    }

    public static void printMatrixWithIndex(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {  // i 1
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d,%d]: %d\n", i, j, matrix[i][j]);
            }
        }
    }

    // Exercise 1
    // Print all of the values of the Matrix in a Grid
    //  1  2  3  4
    //  5  6  7  8
    //  9 10 11 12
    // 13 14 15 16
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {  // i 1
            for (int j = 0; j < matrix[i].length; j++) {
                // SOLUTION 1
//                if (matrix[i][j] < 10) {
//                    System.out.print(" ");
//                }
//                System.out.print(matrix[i][j] + " ");
                // SOLUTION 2
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }


    // Bonus 1
    // Print it separated by ,
    //  1,  2,  3,  4
    //  5,  6,  7,  8
    //  9, 10, 11, 12
    // 13, 14, 15, 16
    public static void printMatrixWithComma(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {  // i 1
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Bonus 2
    // Print it in Reverse
    public static void printMatrixWithCommaInReverse(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {  // i 1
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.printf("%3d", matrix[i][j]);
                if (j > 0) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    // Exercise 2
    // Create a function that asks for a `width` and `height`
    // returns a int[][] matrix with that size, filled with random numbers from 1 to 20
    public static int[][] createRandomMatrix(int width, int height) {
        int[][] matrix = new int[height][width];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 5);
            }
        }

        return matrix;
    }


}
