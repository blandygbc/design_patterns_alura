package com.blandygbc.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

import com.blandygbc.loja.orcamento.Orcamento;
import com.blandygbc.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
    static Logger logger = Logger.getLogger(GeraPedidoHandler.class.getName());

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(action -> action.execute(pedido));

    }
}
