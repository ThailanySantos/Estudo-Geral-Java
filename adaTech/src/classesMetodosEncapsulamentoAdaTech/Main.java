package classesMetodosEncapsulamentoAdaTech;

import classesMetodosEncapsulamentoAdaTech.animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //criar os objetos da classe
        Cachorro cachorroUm = new Cachorro(); //referenciando a classe e criando um novo cachorro (cachorroUm)
        //add valores para os objetos
        //respondendo os atributos
        cachorroUm.nome = "Puppy";
        cachorroUm.cor = "marrom";
        cachorroUm.altura = 25;
        cachorroUm.peso = 5.50;
        cachorroUm.tamanhoRabo = 5;

        cachorroUm.latir();
        cachorroUm.pegar();
        System.out.println("O caozinho pegou sua " + cachorroUm.pegar());

        System.out.println("O cachorro ficou " + cachorroUm.interagir("Carinho"));
    }
}
