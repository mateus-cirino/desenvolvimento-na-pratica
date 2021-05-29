package exercicios.objetos01;

import java.util.LinkedList;
import java.util.List;

public class RegistroPonto {
    private List<Funcionario> funcionariosBateramPonto;

    public RegistroPonto() {
        funcionariosBateramPonto = new LinkedList<>();
    }

    public void baterPonto(Funcionario funcionario) {
        funcionariosBateramPonto.add(funcionario);

        System.out.println("O funcionário " + funcionario.getNome() + " bateu o ponto");
    }

    public void funcionariosQueBateramPonto() {
        for (int i = 0; i < funcionariosBateramPonto.size(); i++) {
            Funcionario funcionario = funcionariosBateramPonto.get(0);

            System.out.println("O funcionário " + funcionario.getNome() + " bateu o ponto");
        }
    }
}
