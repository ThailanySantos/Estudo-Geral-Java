package exercicios;
//(MV²)/2 --> Massa Velocidade

import java.util.Scanner;

public class EnergiaCinetica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a massa do obj: ");
        double massa = leitor.nextDouble();

        System.out.println("Digite a velocidade do obj: ");
        double velocidade = leitor.nextDouble();

        System.out.println("(MV²)/2 : " + (massa * Math.pow(velocidade, 2) / 2));

        leitor.close();
    }
}
