package com.blandygbc.loja;

import java.math.BigDecimal;

import com.blandygbc.loja.pedido.GeraPedido;
import com.blandygbc.loja.pedido.GeraPedidoHandler;

public class CommandMain {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeDeItens = Integer.parseInt(args[2]);
        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(/* Inserindo as dependencias aqui */);
        geraPedidoHandler.execute(geraPedido);
    }
}
