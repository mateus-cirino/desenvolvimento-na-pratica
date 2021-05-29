package exemplos.exemploclasseabstrata;

public class Banco {
    // Vários e vários outros atributos...

    public boolean transferencia(Conta c1, Conta c2, double valor) {
        if (c2.sacar(valor)) {
            c1.depositar(valor);
            return true;
        }
        return false;
    }

    // Vários e vários outros métodos...
}
