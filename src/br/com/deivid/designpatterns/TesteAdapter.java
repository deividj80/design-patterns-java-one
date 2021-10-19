package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.http.ApacheHttpAdapter;
import br.com.deivid.designpatterns.orcamento.ItemOrcamento;
import br.com.deivid.designpatterns.orcamento.Orcamento;
import br.com.deivid.designpatterns.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
        registro.registrar(orcamento);
    }

}