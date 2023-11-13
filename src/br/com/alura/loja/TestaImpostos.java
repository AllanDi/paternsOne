package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;



public class TestaImpostos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraImpostos calcular = new CalculadoraImpostos();
        System.out.println(calcular.calcular(orcamento, new ICMS()));
    }
}
