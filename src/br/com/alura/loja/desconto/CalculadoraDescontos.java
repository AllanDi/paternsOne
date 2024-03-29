package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        if (orcamento.getQuatidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;

    }

}
