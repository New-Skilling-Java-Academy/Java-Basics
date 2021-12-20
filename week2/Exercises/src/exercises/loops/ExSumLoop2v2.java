package exercises.loops;

import java.util.Scanner;

public class ExSumLoop2v2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the number?");
        // TODO: change to user INPUT
        int number = 8;

        long total = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }
            total += i;
            if (i == 3) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + total);
    }

}
