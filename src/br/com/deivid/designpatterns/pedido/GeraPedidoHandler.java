package br.com.deivid.designpatterns.pedido;

import br.com.deivid.designpatterns.orcamento.Orcamento;
import br.com.deivid.designpatterns.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoesAposGerarPedido;

    // injecao de dependencias para servicos de infra
    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
        acoesAposGerarPedido = acoesAposGerarPedidos;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
    }

}