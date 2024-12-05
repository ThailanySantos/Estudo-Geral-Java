package exercicios;

import java.util.Scanner;

public class PerimetroRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        double base = leitor.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        double altura = leitor.nextDouble();

        System.out.println("O perimetro é: " + (2 * (base + altura)));

        leitor.close();
    }
}
