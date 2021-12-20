package exercises.loops;

public class Ex9FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
////            } else if (i % 3 == 0 && i % 5 == 0){
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i <= 100; i++) {
            String fb = "";
            if (i % 3 == 0) {
                fb += "Fizz";
            }
            if (i % 5 == 0) {
                fb += "Buzz";
            }
            if (fb.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(fb);
            }
        }
    }

}
