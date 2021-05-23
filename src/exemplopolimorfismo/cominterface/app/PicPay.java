package exemplopolimorfismo.cominterface.app;

import exemplopolimorfismo.cominterface.Pix;

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
    public String getChavePix() {
        return getCodigoRegistroPicPay();
    }
    //Vários e vários outros métodos ...
}
