package Intermediario.Challenge6;

public class Ninja {
    private String nome;
    private int Idade;
    private String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        Idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return  "Mome: " + nome +
                ", Idade: " + Idade +
                ", Vila: " + vila;
    }
}
