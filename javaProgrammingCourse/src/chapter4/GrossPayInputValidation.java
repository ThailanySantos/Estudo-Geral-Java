package chapter4;

/*
   WHILE LOOP:
  Each store employee makes $15 an hour. Write a program that allows the employee
  to enter the number of hours worked for the week. Do not allow overtime.
 */
import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner reader = new Scanner(System.in);
        double hoursWorked = reader.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = reader.nextDouble();
        }

        reader.close();

        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}