package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int quota = 10;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of sales you made this week: ");
        int sales = reader.nextInt();

        reader.close();

        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short");
        }

    }
}
