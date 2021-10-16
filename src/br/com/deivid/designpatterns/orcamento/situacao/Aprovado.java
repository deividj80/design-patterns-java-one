package br.com.deivid.designpatterns.orcamento.situacao;

import br.com.deivid.designpatterns.DomainException;
import br.com.deivid.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Finalizado());
    }

}