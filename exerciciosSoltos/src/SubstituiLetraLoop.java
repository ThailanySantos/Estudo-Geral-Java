package exercicios;

import java.util.Scanner;

public class SubstituiLetraLoop {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase:  ");
        String frase = leitor.nextLine();

        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a') {
                novaFrase += 'e';
            } else {
                novaFrase += letra;
            }
        }

        System.out.println(novaFrase);

    }
}
