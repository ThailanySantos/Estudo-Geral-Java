package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of items you would you like to scan: ");
        int quantity = reader.nextInt();

        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item:");
            double price = reader.nextDouble();

            total = total + price;
        }
        reader.close();

        System.out.println("Your total is $" + total);
    }

}
