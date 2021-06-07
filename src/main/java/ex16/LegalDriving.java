/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex16;

import java.util.Scanner;

public class LegalDriving {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for the user's age
        System.out.print("What is your age? ");
        String personAge = in.nextLine();

        // Converting string age into type int
        int age = Integer.parseInt(personAge);

        // Creating string for concat to use only 1 output line
        String ability;

        // If-statement to compare the age given and determine if the person can legally drive
        if (age > 16){
            ability = "old enough";
        } else {
            ability = "not old enough";
        }

        // Output within a single line
        System.out.print("You are " + ability + " to legally drive.");
    }
}
