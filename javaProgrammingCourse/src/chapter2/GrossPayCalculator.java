package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        // get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner reader = new Scanner(System.in);
        int hours = reader.nextInt();

        // get the hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        double rate = reader.nextDouble();

        // multiply hours and pay rate
        double grossPay = hours * rate;

        // display result
        System.out.println("The employee's gross pay is: " + grossPay);

    }

}