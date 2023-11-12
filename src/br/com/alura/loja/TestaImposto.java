package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;



public class TestaImposto {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraImposto calcular = new CalculadoraImposto();
        System.out.println(calcular.calcular(orcamento, new ICMS()));
    }
}
