package exemplos.exemploheranca.sem;

public class Banco {
    // Vários e vários outros atributos...

    //Transferencia entre duas contas correntes
    public boolean transferencia(ContaCorrente c1, ContaCorrente c2, double valor) {
        if (c2.sacar(valor)) {
            c1.depositar(valor);
            return true;
        }
        return false;
    }

    //Transferencia entre duas contas poupanças
    public boolean transferencia(ContaPoupanca c1, ContaPoupanca c2, double valor) {
        if (c2.sacar(valor)) {
            c1.depositar(valor);
            return true;
        }
        return false;
    }

    //Transferencia entre uma conta corrente e uma conta poupança
    public boolean transferencia(ContaCorrente c1, ContaPoupanca c2, double valor) {
        if (c2.sacar(valor)) {
            c1.depositar(valor);
            return true;
        }
        return false;
    }

    //Transferencia entre uma conta poupança e uma conta corrente
    public boolean transferencia(ContaPoupanca c1, ContaCorrente c2, double valor) {
        if (c2.sacar(valor)) {
            c1.depositar(valor);
            return true;
        }
        return false;
    }
    // Vários e vários outros métodos...
}
