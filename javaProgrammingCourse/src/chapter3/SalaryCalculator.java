package chapter3;

/*
If Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        Scanner reader = new Scanner(System.in);
        System.out.println("How many sales did the employee make this week? ");
        int sales = reader.nextInt();

        if (sales >= quota) {
          salary = salary + bonus;
        }

        System.out.println("Final payment from sellers: " + salary);

    }
}
