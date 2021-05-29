package exemplos.exemplopolimorfismo.comheranca;

public class ContaCorrente extends Conta {
    // Vários e vários outros atributos...

    @Override
    protected double getRendimento() {
        return 0 * getSaldo();
    }

    // Vários e vários outros métodos...
}
