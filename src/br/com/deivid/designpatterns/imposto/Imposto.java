package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
