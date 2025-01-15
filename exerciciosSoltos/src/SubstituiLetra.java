package exercicios;

import java.util.Scanner;

public class SubstituiLetra {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase:  ");
        String frase = leitor.nextLine();

        String novaFrase = frase.replace('a','e');

        System.out.println(novaFrase);

    }
}
