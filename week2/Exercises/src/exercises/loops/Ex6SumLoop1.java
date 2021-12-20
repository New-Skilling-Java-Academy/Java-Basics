package exercises.loops;

import java.util.Scanner;

public class Ex6SumLoop1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the number?");
        int number = input.nextInt();

        long total = 0;

        for (int i = 1; i <= number; i++) {
            // Calculate total
            total += i;

            // Print number with + for all iterations except the last
            if (i < number) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + total);
    }
}
