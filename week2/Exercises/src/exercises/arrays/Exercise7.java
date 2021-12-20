package exercises.arrays;

public class Exercise7 {

    public static void main(String[] args) {

        String[] names = {"Josie", "Cathrin", "Bob", "Max", "Hannah", "Alex" };
        String longestName = "";

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println(longestName);
    }

}
