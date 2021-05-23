package exemplointerface.app;

public abstract class AppComercial {
    private String dono;
    protected double saldo;
    //Vários e vários outros atributos ...

    public double depositar(double valorASerDepositado) {
        saldo = saldo + valorASerDepositado;
        return valorASerDepositado;
    }
    //Vários e vários outros métodos ...
}
