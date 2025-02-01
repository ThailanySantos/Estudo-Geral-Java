package chapter3;

/*
 NESTED IFS:
 To qualify for a loan, a person must make at least $30,000
 and have been working at their current job for at least 2 years
*/

import java.util.Scanner;

public class NewLogicalLoanQualifier {

    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = reader.nextDouble();

        reader.nextLine();

        System.out.println("Enter the number of years with your current employer: ");
        double years = reader.nextDouble();

        if (years >= requiredYearsEmployed && salary >= requiredSalary ) {
                System.out.println("Congrats! You qualify for the loan");
            } else {
            System.out.println("Sorry, you must earn at least $"
                    + requiredSalary + " to qualify for the loan");
        }
}}
