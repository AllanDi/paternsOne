package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quatidadeItens;

    public Orcamento(BigDecimal valor, int quatidadeItens){
        this.valor = valor;
        this.quatidadeItens = quatidadeItens;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public int getQuatidadeItens(){
        return quatidadeItens;
    }
}
