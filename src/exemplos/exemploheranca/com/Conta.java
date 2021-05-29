package exemplos.exemploheranca.com;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    // Vários e vários outros atributos...

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valorASerSacado) {
        if (saldo >= valorASerSacado) {
            saldo = saldo - valorASerSacado;
            return true;
        }
        return false;
    }

    public double depositar(double valorASerDepositado) {
        saldo = saldo + valorASerDepositado;
        return valorASerDepositado;
    }

    // Vários e vários outros métodos...
}
