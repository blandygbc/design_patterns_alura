package com.blandygbc.loja.pedido.acao;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    static Logger logger = Logger.getLogger(EnviarEmailPedido.class.getName());

    public void execute(Pedido pedido) {
        logger.log(Level.INFO, "Enviando email do pedido {0}...", pedido);
    }
}
