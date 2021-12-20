package exercises.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class EuroMillions {

    public static void main(String[] args) {
        // EuroMillions
        // 5 numbers between 1 and 50
        // 2 stars between 1 and 12

        // generate a bet for EuroMillions
        // remember numbers cannot repeat themselves
        // stars cannot repeat themselves

        // step by step
        // - ignore the stars
        // - create an empty array with 5 positions
        // - fill them out with random numbers
        // - the numbers should not repeat... do that
        // - now the same for stars, should be just copy and paste

        // BONUS
        // - output the result as a sorted String

        String originalKey = euroMillions();

        int counter = 0;
        while (true) {
            counter++;
            if (counter % 10_000_000 == 0) {
                System.out.println(counter / 1_000_000);
            }

            String newKey = euroMillions();
            if (newKey.equals(originalKey)) {
                break;
            }
        }
        System.out.printf("It took %d tries to find the key %s again\n", counter, originalKey);

    }

    public static String euroMillions() {
        int[] numbers = generateRandomArray(1, 50, 5);
        int[] stars = generateRandomArray(1, 12, 2);

        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += numbers[i];
        }

        result += " - ";

        for (int i = 0; i < stars.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += stars[i];
        }

        return result;
    }

    public static int[] generateRandomArray(int min, int max, int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            int possibleNumber;

            do {
                possibleNumber = generateRandom(min, max);
            } while (itExists(numbers, possibleNumber));

            numbers[i] = possibleNumber;
        }

        Arrays.sort(numbers);

        return numbers;
    }

    public static int generateRandom(int min, int max) {
        int number = ThreadLocalRandom.current().nextInt(min, max + 1);
        return number;
    }

    public static boolean itExists(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

}
