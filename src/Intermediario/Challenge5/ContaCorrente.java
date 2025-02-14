package Intermediario.Challenge5;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public ContaCorrente(double saldo, String nomeDoCliente) {
        super(saldo, nomeDoCliente);
    }

    public ContaCorrente(double saldo, String nomeDoCliente, TipoConta tipoConta) {
        super(saldo, nomeDoCliente, tipoConta);
    }
}
