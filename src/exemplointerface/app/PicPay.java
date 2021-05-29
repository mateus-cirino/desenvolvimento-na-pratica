package exemplointerface.app;

import exemplointerface.Pix;

public class PicPay extends AppComercial implements Pix {
    private String codigoRegistroPicPay;
    //Vários e vários outros atributos ...

    public String getCodigoRegistroPicPay() {
        return codigoRegistroPicPay;
    }

    public void setCodigoRegistroPicPay(String codigoRegistroPicPay) {
        this.codigoRegistroPicPay = codigoRegistroPicPay;
    }

    @Override
    public double depositarPix(double valorASerDepositadoPix) {
        setSaldo(getSaldo() + valorASerDepositadoPix);
        return valorASerDepositadoPix;
    }
    //Vários e vários outros métodos ...
}
