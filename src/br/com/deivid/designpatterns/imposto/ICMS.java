package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}