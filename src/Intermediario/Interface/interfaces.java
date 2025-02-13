package Intermediario.Interface;

public class interfaces {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 18, " Aldeia da Folha");
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake("kakashi Hatake", 17, "Aldeia da Folha");
        kakashi.sharinganAtivado();
        kakashi.boasVindas();
        kakashi.ninjaDeElite();
    }
}
