package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
    
}
