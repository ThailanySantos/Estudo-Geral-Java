// v = deltaS/deltaT --> espaço sobre o tempo
package exercicios;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a variação do tempo: ");
        double deltaT = leitor.nextDouble();

        System.out.println("Digite a variação do espaço: ");
        double deltaS = leitor.nextDouble();

        System.out.println("A velocidade média é: " + (deltaS / deltaT));

        leitor.close();
    }

}

