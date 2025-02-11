package Intermediário.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadesEspeciais(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Status da Missão: " + statusMissao);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
