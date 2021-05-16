package exemploclasseabstrata;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    // Vários e vários outros atributos...

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
