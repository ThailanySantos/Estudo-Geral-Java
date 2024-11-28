package condicionaisAdaTech;

public class Main {
    public static void main(String[] args) {
//
//        int nota = 70;
//
//        //nota maior ou igual a 70, então aprovado -- if else
//        if (nota >= 70) {
//            System.out.println("Aprovado com nota " + nota + "!");
//        } else {
//            System.out.println("Reprovado com nota " + nota + "!");
//        }

        int nota = 50;
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 50) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A" -> System.out.println("PASSOU!!");
            case "B" -> System.out.println("PASSOU!!");
            case "C" -> System.out.println("REPROVOU!!");
            case "D" -> System.out.println("REPROVOU!!");
            default -> System.out.println("INVALIDO!!");
        }
    }
}
