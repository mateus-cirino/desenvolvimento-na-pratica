package exemplopolimorfismo.cominterface.cartao;

public class CartaoCredito extends Cartao {
    private double credito;
    private double limite;
    //Vários e vários outros atributos ...

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean usarCredito(double valorCompra) {
        if ((credito - limite) > valorCompra) {
            credito = credito + valorCompra;
            return true;
        }
        return false;
    }

    public double pagarFatura(double valorFatura) {
        credito = credito - valorFatura;
        return credito;
    }
    //Vários e vários outros métodos ...
}
