package exercises.loops;

import java.util.Scanner;

public class Ex8SumLoop3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type `P` for Product and `S` for Sum");
        char choice = input.nextLine().charAt(0);

        System.out.println("What's the number?");
        int number = input.nextInt();

        int result;
        String lineNumbers;
        if (choice == 'P') {
            result = factorial(number);
            lineNumbers = getLineNumbers(number, " x ");
        } else {
            result = sumTotal(number);
            lineNumbers = getLineNumbers(number, " + ");
        }

        String resultText = lineNumbers + " = " + result;
        System.out.println(resultText);
    }

    public static int sumTotal(int number) {
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        return total;
    }

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static String getLineNumbers(int number, String separator) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            if (i > 1) {
                result += separator;
            }
            result += i;
        }
        return result;
    }


}
