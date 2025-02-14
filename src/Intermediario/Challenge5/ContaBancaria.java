package Intermediario.Challenge5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    String nomeDoCliente;
    TipoConta tipoConta;

    @Override
    public abstract void depositar(double valor);

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é de" + this.nomeDoCliente + "é de: $" + this.saldo);
    }

    public ContaBancaria(double saldo, String nomeDoCliente) {
        this.saldo = saldo;
        this.nomeDoCliente = nomeDoCliente;
    }



    public ContaBancaria(double saldo, String nomeDoCliente, TipoConta tipoConta) {
        this(saldo, nomeDoCliente);
        this.tipoConta = tipoConta;
    }
}
