package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = leitor.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = leitor.nextDouble();

        System.out.println("A soma é " + (num1 + num2));
        System.out.println("A subtração é " + (num1 - num2));
        System.out.println("A multiplicação é " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("A divisão é " + (num1 / num2));
        } else {
            System.out.println("Sem divisão por 0 aqui ( ﾉ ﾟｰﾟ)ﾉ  -( xo xo xo )");
        }
        leitor.close();
    }
}