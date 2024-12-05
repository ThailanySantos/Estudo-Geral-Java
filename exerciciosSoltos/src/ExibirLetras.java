package exercicios;

import java.util.Scanner;

public class ExibirLetras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println(letra);

            leitor.close();
        }

    }
}