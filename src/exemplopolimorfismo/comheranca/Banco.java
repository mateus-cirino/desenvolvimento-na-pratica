package exemplopolimorfismo.comheranca;

public class Banco {
    // Vários e vários outros atributos...

    public double render(Conta conta) {
        conta.setSaldo(conta.getSaldo() + conta.getRendimento());
        return conta.getSaldo();
    }

    // Vários e vários outros métodos...
}
