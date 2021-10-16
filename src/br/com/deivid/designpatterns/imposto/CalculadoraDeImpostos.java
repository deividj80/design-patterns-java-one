package br.com.deivid.designpatterns.imposto;

import br.com.deivid.designpatterns.enums.TipoImposto;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){

        return imposto.calcular(orcamento);

    }

}
