package com.blandygbc.loja.pedido;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
    static Logger logger = Logger.getLogger(GeraPedidoHandler.class.getName());

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        logger.log(Level.INFO, "Gerando o pedido: {0} \n", pedido);
        logger.log(Level.INFO, "Salvando no banco");
        logger.log(Level.INFO, "Enviando email com o pedido");
    }
}
