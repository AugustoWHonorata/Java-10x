package Intermediario.Chellange3;

public class NinjasChallenge3 {
    public static void main(String[] args) {
        NinjaChallenge3 naruto = new NinjaChallenge3();
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
