package exercises.arrays;

import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {

        int[] numbers = {10, 11, 12, 13, 14, 15};

        int[] reverse = reverseArray(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));

//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < numbers.length; i++) {
//            int mirrorIndex = (numbers.length - 1) - i;
//            System.out.print(numbers[mirrorIndex] + " ");
//        }

    }

    public static int[] reverseArray(int[] originalNumbers) {
        int[] reversedNumbers = new int[originalNumbers.length];

        for (int i = 0; i < originalNumbers.length; i++) {
            int mirrorIndex = (originalNumbers.length - 1) - i;

            reversedNumbers[i] = originalNumbers[mirrorIndex];
        }
        return reversedNumbers;
    }

}
