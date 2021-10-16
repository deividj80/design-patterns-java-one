package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.desconto.CalculadoraDeDescontos;
import br.com.deivid.designpatterns.imposto.CalculadoraDeImpostos;
import br.com.deivid.designpatterns.imposto.ICMS;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
        Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}
