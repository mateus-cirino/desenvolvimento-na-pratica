package exemplos.exemplopolimorfismo.comheranca;

public abstract class Conta {
    private double saldo;
    // Vários e vários outros atributos...

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valorASerDepositado) {
        saldo = saldo + valorASerDepositado;
        return valorASerDepositado;
    }

    protected abstract double getRendimento();

    // Vários e vários outros métodos...
}
