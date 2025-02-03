package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = reader.next();
        greetUser(name);

    }

    public static void greetUser (String name) {
        System.out.println("Hi, " + name);
    }

}
