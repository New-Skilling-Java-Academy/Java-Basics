package exercises.arrays;

public class Exercise6 {

    public static void main(String[] args) {
        String[] names = {"Josie", "Cathrin", "Bob", "Max", "Hannah", "Alex" };

        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d: %s\n", i, names[i]);
            }
        }
    }

}
