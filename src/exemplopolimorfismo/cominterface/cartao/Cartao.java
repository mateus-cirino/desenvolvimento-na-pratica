package exemplopolimorfismo.cominterface.cartao;

import java.util.Date;

public abstract class Cartao {
    private int numero;
    private String cpf;
    private Date dtValidade;
    private String codigoSeguranca;
    //Vários e vários outros atributos...

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
    //Vários e vários outros métodos
}
