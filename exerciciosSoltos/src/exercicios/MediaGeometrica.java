package exercicios;

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = leitor.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double num3 = leitor.nextDouble();

        //Math.pow calculou a raiz cúbica
        System.out.println("A media geometrica: " + Math.pow(num1 * num2 * num3, 1.0/3.0));

        leitor.close();
    }
}
