package Intermediario.Interface;

public class Uchiha extends Ninja implements SharinganInterface{
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": ativou o Sharingan");
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha() {
    }
}
