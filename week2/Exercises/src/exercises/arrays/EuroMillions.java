package exercises.arrays;

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

//        int[] numbers = {50, 22, 3, 0, 0};
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            int possibleNumber = generateRandom(1, 5);
            while (itExists(numbers, possibleNumber)) {
                possibleNumber = generateRandom(1,5);
            }
            numbers[i] = possibleNumber;
        }

        System.out.println(Arrays.toString(numbers));
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
