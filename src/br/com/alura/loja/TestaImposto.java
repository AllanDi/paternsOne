package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

import static br.com.alura.loja.imposto.TipoImposto.ICMS;

public class TestaImposto {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calcular = new CalculadoraDeImposto();
        System.out.println(calcular.calcular(orcamento, ICMS));






    }
}
