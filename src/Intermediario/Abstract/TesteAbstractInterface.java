package Intermediario.Abstract;

public class TesteAbstractInterface {
    public static void main(String[] args) {

    Uzumaki naruto = new Uzumaki();
    Uchiha sasuke = new Uchiha();

        naruto.apresentar();
        naruto.realizarJutsu();
        naruto.detectarChakra();

        sasuke.apresentar();
        sasuke.realizarJutsu();
        sasuke.detectarChakra();
    }
}
