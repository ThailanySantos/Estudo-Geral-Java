package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numberStudents = 24;
        int numberTests = 4;

        for (int i = 0; i < numberStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberTests; j++) {
                System.out.println("Enter the score for test # " + (j + 1));
                double score = reader.nextDouble();
                total = total + score;
            }

            double average = total / numberTests;
            System.out.println("The test average for student #" + (i + 1) + " " + average);

        }

        reader.close();

    }

}
