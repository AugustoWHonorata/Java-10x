package Intermediario.Generics;

public class Shuriken {
    private int quantidade;

    public Shuriken(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Shuriken - quantidade: " + quantidade;
    }
}
