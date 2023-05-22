package com.blandygbc.loja.pedido.acao;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

    static Logger logger = Logger.getLogger(LogDePedido.class.getName());

    @Override
    public void execute(Pedido pedido) {
        logger.log(Level.INFO, "Pedido enviado com sucesso!: {0} \n", pedido);
    }

}
