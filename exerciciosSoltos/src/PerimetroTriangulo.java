package exercicios;

import java.util.Scanner;

public class PerimetroTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado: ");
        double ladoA = leitor.nextDouble();

        System.out.println("Digite o valor do segundo lado: ");
        double ladoB = leitor.nextDouble();

        System.out.println("Digite o valor do terceiro lado: ");
        double ladoC = leitor.nextDouble();

        System.out.println("O perimetro do triangulo é: " + (ladoA + ladoB + ladoC));

        leitor.close();

    }
}