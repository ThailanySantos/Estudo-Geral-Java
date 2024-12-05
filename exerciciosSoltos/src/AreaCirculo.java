package exercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = leitor.nextDouble();

        System.out.println("A area do circulo é: " + (Math.PI * Math.pow(raio, 2)));

        leitor.close();
    }
}