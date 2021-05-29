package exemplointerface.app;

public abstract class AppComercial {
    private String dono;
    private double saldo;
    //Vários e vários outros atributos ...

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

    public double depositar(double valorASerDepositado) {
        saldo = saldo + valorASerDepositado;
        return valorASerDepositado;
    }
    //Vários e vários outros métodos ...
}
