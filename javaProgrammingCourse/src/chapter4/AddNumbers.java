package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        boolean again;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Enter the first number: ");
            double numberOne = reader.nextDouble();

            System.out.println("Enter the second number: ");
            double numberTwo = reader.nextDouble();

            double sumNumbers = numberOne + numberTwo;

            System.out.println("Sum: " + sumNumbers);

            System.out.println("Would you like to start over? (True or False)");
            again = reader.nextBoolean();

        }while (again);

        reader.close();

    }

}
