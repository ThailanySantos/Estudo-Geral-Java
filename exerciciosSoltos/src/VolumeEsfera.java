package exercicios;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio da esfera: ");
        double raio = leitor.nextDouble();

        System.out.println("O volume é: " + (4.0/3.0) * Math.PI * Math.pow(raio, 3));

        leitor.close();
    }
}