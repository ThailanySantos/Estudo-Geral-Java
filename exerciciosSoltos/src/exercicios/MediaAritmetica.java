package exercicios;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        double num2 = leitor.nextInt();

        System.out.println("A media dos numero é: " + ((num1 + num2) / 2));

        leitor.close();
    }
}
