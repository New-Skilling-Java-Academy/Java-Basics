package com.company;

public class DebugExample {

    public static void main(String[] args) {
        String name = "Bob";
        int age = 20;

        int x = age + 2;
        int y = x++;
        int z = x + y + age;

        System.out.println(name);
        System.out.println(age);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }

}
