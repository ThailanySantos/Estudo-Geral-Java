package chapter5;

import java.util.Scanner;

        //insert plan fee
        //insert extra minutes
        //charge 0.25 per minute that exceeds the plan
        //" 15% subtotal tax
        //separate methods for calculating tax, surpluses and final total
        //print detailed invoice

public class OptionalIndependentExercise {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter base cost of the plan: ");
        double baseCost = reader.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overageMinutes = reader.nextInt();

        reader.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax =  calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);

    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        return extraMinutes * rate;
    }

    public static double  calculateTax(double subtotal){
        double rate = 0.15;
        return rate * subtotal;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement - Operator Thai's");
        System.out.println("Plan: $" + base);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + finalTotal);
    }

}
