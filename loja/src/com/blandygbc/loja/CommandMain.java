package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.blandygbc.loja.pedido.GeraPedido;
import com.blandygbc.loja.pedido.GeraPedidoHandler;
import com.blandygbc.loja.pedido.acao.AcaoAposGerarPedido;
import com.blandygbc.loja.pedido.acao.EnviarEmailPedido;
import com.blandygbc.loja.pedido.acao.LogDePedido;
import com.blandygbc.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class CommandMain {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeDeItens = Integer.parseInt("2");
        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
        List<AcaoAposGerarPedido> acoes = Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido(),
                new LogDePedido());
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(acoes);
        geraPedidoHandler.execute(geraPedido);
    }
}
