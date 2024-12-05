package exercicios;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        double altura = leitor.nextDouble();

        System.out.println("Seu IMC é de: " + (peso/(altura*altura)));

    }
}
