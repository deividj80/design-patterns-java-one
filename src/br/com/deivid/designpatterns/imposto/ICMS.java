package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
