package exercicios;

import java.util.Scanner;

public class CalculaDelta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //(b*b) - 4ac --> 3 variareis a,b,c

        System.out.println("Digite um numero para a variavel A: ");
        double a = leitor.nextDouble();

        System.out.println("Digite um numero para a variavel B: ");
        double b = leitor.nextDouble();

        System.out.println("Digite um numero para a variavel C: ");
        double c = leitor.nextDouble();

        System.out.println("O delta (b² - 4ac) é: " + ((Math.pow(b, 2)) - (4 * a * c)));

        leitor.close();
    }
}
