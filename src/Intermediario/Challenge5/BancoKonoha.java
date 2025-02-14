package Intermediario.Challenge5;

public class BancoKonoha {
    public static void main(String[] args) {
        ContaCorrente narutoUzumaki = new ContaCorrente(1000, "Naruto Uzumaki", TipoConta.CORRENTE);
        narutoUzumaki.consultarSaldo();
        narutoUzumaki.depositar(200.50);
        narutoUzumaki.consultarSaldo();

        ContaPoupanca kakashiHatake = new ContaPoupanca(1000, "Kakashi Hatake", TipoConta.POUPANCA);
        kakashiHatake.consultarSaldo();
        kakashiHatake.depositar(1000);
        kakashiHatake.consultarSaldo();
    }
}
