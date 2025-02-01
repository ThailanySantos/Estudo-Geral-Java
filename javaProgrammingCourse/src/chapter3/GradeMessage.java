package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        String message;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        String grade = reader.nextLine();

        switch (grade.toUpperCase()) {
            case "A" -> message = "Excellent job!";
            case "B" -> message = "Great job!";
            case "C" -> message = "Good job!";
            case "D" -> message = "You need to work a bit harder";
            case "F" -> message = "Uh oh!";
            default -> message = "Error. Invalid grade";
        }

        System.out.println(message);
    }

}
