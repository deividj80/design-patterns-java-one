package br.com.deivid.designpatterns.pedido.acao;

import br.com.deivid.designpatterns.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados...");
    }

}