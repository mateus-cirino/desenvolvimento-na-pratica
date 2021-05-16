package exemplointerface.cartao;

import exemplointerface.Pix;

public class CartaoDebito extends Cartao implements Pix {
    private double saldo;
    //Vários e vários outros atributos ...

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

    @Override
    public String getChavePix() {
        return getCpf();
    }

    //Vários e vários outros métodos
}
