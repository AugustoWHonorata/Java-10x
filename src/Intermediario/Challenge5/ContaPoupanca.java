package Intermediario.Challenge5;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        this.saldo += (valor * 0.99);
    }

    public ContaPoupanca(double saldo, String nomeDoCliente) {
        super(saldo, nomeDoCliente);
    }

    public ContaPoupanca(double saldo, String nomeDoCliente, TipoConta tipoConta) {
        super(saldo, nomeDoCliente, tipoConta);
    }
}
