package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDescontos;
import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;


public class TestaDescontos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        CalculadoraDescontos calcular = new CalculadoraDescontos();
        System.out.println(calcular.calcular(orcamento));
    }
}
