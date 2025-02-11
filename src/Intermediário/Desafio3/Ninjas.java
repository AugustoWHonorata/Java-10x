package Intermediário.Desafio3;

public class Ninjas {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.idade = 16;
        naruto.statusMissao = "Inconcluido";
        naruto.mostrarInformacoes();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.statusMissao = "Concluida";
        sasuke.habilidadeEspecial = "Fazer clones";
        sasuke.mostrarHabilidadesEspeciais();
        sasuke.mostrarInformacoes();

    }
}
