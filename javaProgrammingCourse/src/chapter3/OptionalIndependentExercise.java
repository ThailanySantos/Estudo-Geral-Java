package chapter3;

import java.util.Scanner;

public class OptionalIndependentExercise {

    public static void main(String[] args){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " + "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = reader.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = reader.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = reader.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = reader.nextInt();

        reader.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}