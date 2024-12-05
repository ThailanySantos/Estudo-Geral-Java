package exercicios;
//t = f * d

import java.util.Scanner;

public class CalculaForca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a força aplicada: ");
        double forca = leitor.nextDouble();

        System.out.println("Digite a distancia percorrida: ");
        double distancia = leitor.nextDouble();

        System.out.println("A forca é: " + (forca * distancia));

        leitor.close();
    }
}