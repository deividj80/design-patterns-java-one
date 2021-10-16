package br.com.deivid.designpatterns.orcamento.situacao;

import br.com.deivid.designpatterns.DomainException;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }

}