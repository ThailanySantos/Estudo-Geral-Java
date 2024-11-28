package booleanosAdaTech;

public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //tabela verdade
        //operador && (AND)
        //true && true = true - APENAS
        //operador || (OR)
        //false || false = false - APENAS

       System.out.println(vamosAPraia);

       String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

    }
}
