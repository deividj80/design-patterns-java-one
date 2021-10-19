package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}