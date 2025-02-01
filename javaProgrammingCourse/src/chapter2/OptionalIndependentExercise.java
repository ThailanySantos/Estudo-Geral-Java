package chapter2;

import java.util.Scanner;

public class OptionalIndependentExercise {

    public static void main(String[] args) {
        //create a program that asks a user for a season of the year, then a whole number, then an adjective.
        //use the input to complete the sentence below then output the results:
        //"On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a season of the year: ");
        String season = reader.nextLine();

        System.out.println("Enter an whole number: ");
        int number = reader.nextInt();
        reader.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = reader.nextLine();

        reader.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}

