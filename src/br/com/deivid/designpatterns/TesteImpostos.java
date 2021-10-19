package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.imposto.ICMS;
import br.com.deivid.designpatterns.imposto.ISS;
import br.com.deivid.designpatterns.imposto.Imposto;
import br.com.deivid.designpatterns.orcamento.ItemOrcamento;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("300")));

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }
}
