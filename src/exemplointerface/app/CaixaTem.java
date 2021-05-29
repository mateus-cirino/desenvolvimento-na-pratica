package exemplointerface.app;

import exemplointerface.Pix;

public class CaixaTem extends AppComercial implements Pix {
    private String codigoTrabalhador;
    //Vários e vários outros atributos ...

    public String getCodigoTrabalhador() {
        return codigoTrabalhador;
    }

    public void setCodigoTrabalhador(String codigoTrabalhador) {
        this.codigoTrabalhador = codigoTrabalhador;
    }

    @Override
    public double depositarPix(double valorASerDepositadoPix) {
        setSaldo(getSaldo() + valorASerDepositadoPix);
        return valorASerDepositadoPix;
    }
    //Vários e vários outros métodos ...
}
