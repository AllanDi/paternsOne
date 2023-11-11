package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

import static br.com.alura.loja.imposto.TipoImposto.ISS;

public class TestaImposto {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calcular = new CalculadoraImposto();
        System.out.println(calcular.calcular(orcamento, ISS));






    }
}
