package exercicios;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a coordenada x do primeiro ponto: ");
        double x1 = leitor.nextDouble();

        System.out.println("Digite a coordenada y do primeiro ponto: ");
        double y1 = leitor.nextDouble();

        System.out.println("Digite a coordenada x do segundo ponto: ");
        double x2 = leitor.nextDouble();

        System.out.println("Digite a coordenada y do segundo ponto: ");
        double y2 = leitor.nextDouble();

        System.out.println("Distancia ente os pontos é: " + Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));

        leitor.close();
    }
}