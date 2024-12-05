package exercicios;

import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = leitor.nextDouble();

        System.out.println("O perimetro do circulo é: " + (2 * Math.PI * raio));

        leitor.close();
    }
}
