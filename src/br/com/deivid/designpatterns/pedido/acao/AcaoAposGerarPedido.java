package br.com.deivid.designpatterns.pedido.acao;

import br.com.deivid.designpatterns.pedido.Pedido;

public interface AcaoAposGerarPedido {

    void executarAcao(Pedido pedido);

}