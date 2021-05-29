package exemplos.exemplopolimorfismo.cominterface;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    // Vários e vários atributos
    List<Pix> pixCadastrados;

    public Banco() {
        pixCadastrados = new LinkedList<>();
    }

    //Vários e vários métodos
    public boolean adicionarNovoPix(final Pix pix) {
        return pixCadastrados.add(pix);
    }

    public boolean verificarPixCadastrado(final String chavePix) {
        for (int i = 0; i < pixCadastrados.size(); i++) {
            Pix pix = pixCadastrados.get(i);
            if (pix.getChavePix() == chavePix) {
                return true;
            }
        }
        return false;
    }
}
