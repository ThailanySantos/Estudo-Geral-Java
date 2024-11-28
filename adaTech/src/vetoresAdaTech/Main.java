package vetoresAdaTech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] letras = new String[5];
        //[0] [1] [2] [3] [4]
        // String[] letras = { "A", "B", "C", "D", "E" };
//        letras[0] = "A";
//        letras[1] = "B";
//        letras[2] = "C";
//        letras[3] = "D";
//        letras[4] = "E";
//        for (int i = 0; i < letras.length; i++) {
//            System.out.println(letras[i]);
//        }
//
//        System.out.println(Arrays.toString(letras)); // [A, B, C, D, E]

        int[] numeros = {1, 2, 3, 4, 5};
        int maior = numeros[0]; //primeiro numero do array
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media / numeros.length);
    }
}
