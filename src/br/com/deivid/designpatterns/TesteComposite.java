package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.orcamento.ItemOrcamento;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposite {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }

}