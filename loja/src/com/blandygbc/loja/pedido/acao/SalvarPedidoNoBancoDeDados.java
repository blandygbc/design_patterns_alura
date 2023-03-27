package com.blandygbc.loja.pedido.acao;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    static Logger logger = Logger.getLogger(SalvarPedidoNoBancoDeDados.class.getName());

    public void execute(Pedido pedido) {
        logger.log(Level.INFO, "Salvando o pedido {0} no banco", pedido);
    }
}
