package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Sets up first two numbers as well as desired mathematical operation
        Scanner Num = new Scanner(System.in);
        System.out.print("Please enter your first number.");
        double fNum = Num.nextDouble();
        System.out.print("Please enter your second number.");
        double sNum = Num.nextDouble();

        Scanner Word = new Scanner(System.in);
        System.out.print("Do you want to add, subtract, multiply or divide these two numbers?");
        String operation = Word.next();

        // Does the proper calculation according to what the user requests
        double finalNum = 0;
        boolean proper;
        do {
            if (operation.equals("add")) {
                finalNum = fNum + sNum;
                proper = true;

            } else if (operation.equals("subtract")) {
                finalNum = fNum - sNum;
                proper = true;

            } else if (operation.equals("multiply")) {
                finalNum = fNum * sNum;
                proper = true;

            } else if (operation.equals("divide")) {
                finalNum = fNum / sNum;
                proper = true;

            } else {
                System.out.print("Sorry, I didn't get that. Please specify whether you want to 'add', 'subtract', 'multiply' or 'divide'.");
                operation = Word.next();
            }
        } while (proper = false);

        double incNum = Math.sqrt(finalNum);

        // Ensures that the print statement on line 54 won't print out "divideing"
        if (operation.equals("divide")) {
            operation = "divid";
        }

        System.out.println("The result of " + operation + "ing " + ((int)fNum) + " and " + ((int)sNum) + " is " + incNum + ". Are you satisfied?");
        String answer = Word.next();

        if (answer.equals("yes")) {
            /* Some results (like 1 * 1) will still get the same answer even after you square it.
            That's why line 58 was implemented. */
            if (finalNum == incNum) {
                System.out.println("I actually squared the result, but you are still correct.");
            }
            else {
                System.out.println("You shouldn't be. I've manipulated your result. Goodbye.");
            }
        }
        else if (answer.equals("no")) {
            System.out.println("Can you identify what math class method I ran the real answer through?");
        }

        String gMethod = Word.next();

        if (gMethod.equals("sqrt")) {
            System.out.println("Great! Good job and goodbye!");

        } else {
            System.out.println("Nope, that wasn't it. It was sqrt.");
        }
    }
}
