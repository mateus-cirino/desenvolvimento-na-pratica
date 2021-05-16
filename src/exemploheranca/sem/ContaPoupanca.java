package exemploheranca.sem;

public class ContaPoupanca {
    private int numero;
    private String dono;
    private double saldo;
    private double taxaRendimento;
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

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double render() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        return getSaldo();
    }
    // Vários e vários outros métodos...
}
