package chapter4;

import java.util.Random;

public class OptionalIndependentExercise {

    public static void main(String[] args) {

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        for (int i = 1; i < maxRolls; i++) {

            int dice = random.nextInt(6) + 1;
            currentSpace = currentSpace + dice;

            System.out.println("Roll " + i + ": You're rolled a " + dice);

            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }

            System.out.println();

        }


    }

}
