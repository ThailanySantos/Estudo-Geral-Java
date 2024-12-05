package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        double base = leitor.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        double altura = leitor.nextDouble();

        System.out.println("A area do triangulo é: " + ((base * altura) / 2));

        leitor.close();
    }
}
