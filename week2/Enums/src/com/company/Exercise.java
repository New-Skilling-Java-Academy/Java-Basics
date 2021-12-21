package com.company;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        // Create an Enum class for 4 Directions
        // North, West, East, South

        // Ask the user which directions they want to go in.
        // Print a nice message back to the user

        Scanner input = new Scanner(System.in);
        System.out.println("Which direction would you like to go in?");
        System.out.println("(N)orth, (W)est, (S)outh, (E)ast");

        char userInput = input.nextLine().toUpperCase().charAt(0);

        Direction userDirection;
        switch(userInput) {
            case 'W':
                userDirection = Direction.WEST;
                break;
            case 'S':
                userDirection = Direction.SOUTH;
                break;
            case 'E':
                userDirection = Direction.EAST;
                break;
            case 'N':
            default:
                userDirection = Direction.NORTH;
                break;
        }

        System.out.println(userDirection);

        String n1 = "NORTH";
        Direction n2 = Direction.NORTH;


        if (n2.toString().equals(n1)) {
            System.out.println("Let's go NORTH!!!!!");
        }
    }
}
