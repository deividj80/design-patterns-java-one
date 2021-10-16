package br.com.deivid.designpatterns;

import br.com.deivid.designpatterns.pedido.GeraPedido;
import br.com.deivid.designpatterns.pedido.GeraPedidoHandler;
import br.com.deivid.designpatterns.pedido.acao.CriarPedidoNoBanco;
import br.com.deivid.designpatterns.pedido.acao.EnviarPedidoPorEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new EnviarPedidoPorEmail(),
                new CriarPedidoNoBanco()));
        handler.executar(gerador);
    }

}