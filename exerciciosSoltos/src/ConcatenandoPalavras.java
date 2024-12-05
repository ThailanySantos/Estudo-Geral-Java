package exercicios;

import java.util.Scanner;

public class ConcatenandoPalavras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavraUm = leitor.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavraDois = leitor.nextLine();

        System.out.println(palavraUm + " " + palavraDois);

        leitor.close();
    }
}