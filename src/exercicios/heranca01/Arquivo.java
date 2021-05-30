package exercicios.heranca01;

import java.math.BigDecimal;

public abstract class Arquivo {
    private String nome;
    private BigDecimal peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
}
