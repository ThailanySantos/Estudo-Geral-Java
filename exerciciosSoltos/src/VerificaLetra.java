package exercicios;

import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        String palavraMinuscula = palavra.toLowerCase();

        if (palavraMinuscula.startsWith("a")) {
            System.out.println("Palavra começa com a letra A");
        } else {
            System.out.println("Palavra não começa com a letra A");
        }


    }
}
