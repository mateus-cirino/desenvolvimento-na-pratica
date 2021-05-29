package exemploclasseabstrata;

public class ContaPoupanca extends Conta {
    // Vários e vários outros atributos...

    @Override
    protected double getRendimento() {
        return 5 * getSaldo();
    }

    // Vários e vários outros métodos...
}
