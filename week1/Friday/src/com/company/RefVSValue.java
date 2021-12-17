package com.company;

import java.util.Arrays;

public class RefVSValue {

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

//        int[] x = {30, 12, 50};
//        int[] y = x;
//
//        x[1] = 5;
//
//        x = new int[]{10, 10, 10};
//
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));

        int[] x = {10, 10, 10};
        int[] y = copyArray(x);

        y[1] = 20;

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

}
