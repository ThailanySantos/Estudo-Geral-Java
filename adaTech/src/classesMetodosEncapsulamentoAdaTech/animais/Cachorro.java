package classesMetodosEncapsulamentoAdaTech.animais;

public class Cachorro {

    //definir os atributos da classe -- definir as caracteristicas do cachorro
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoRabo;
    public String sentimento;

    //ass de um metodo -- definicao
//    public void comer() {
//
//    }

    public void latir() {

        System.out.println("AU AU AU AU");

    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "Carinho" -> this.sentimento = "feliz";
            case "Vai dormir" -> this.sentimento = "bravo";
            case "Pisar na patinha" -> this.sentimento = "triste";
            default -> this.sentimento = "neutro";
        }

//        if(acao.equalsIgnoreCase("Carinho")){
//            this.sentimento = "feliz";
//        } else if (acao.equalsIgnoreCase("Vai dormir")) {
//            this.sentimento = "bravo";
//        } else {
//            this.sentimento = "neutro";
//        }
        return sentimento;
    }

    public static void main(String[] args) {


    }
}
