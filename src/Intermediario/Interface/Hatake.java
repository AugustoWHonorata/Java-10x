package Intermediario.Interface;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{
    public void boasVindas(){
        System.out.println(nome + "eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da tribo Anbu");
    }

    public Hatake(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Hatake() {
    }
}
