package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.enums.TipoImposto;
import br.com.deivid.designpatterns.imposto.CalculadoraDeImpostos;
import br.com.deivid.designpatterns.imposto.ICMS;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento,new ICMS()));
    }
}
