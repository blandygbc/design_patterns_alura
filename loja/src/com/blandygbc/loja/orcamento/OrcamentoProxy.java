package com.blandygbc.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy implements Orcavel {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        // TODO: Poderia implementar um tempo de cache armazenando a data de atribuição
        // e um valor com o tempo de vida
        // TODO: Realizar uma checagem se o tempo de chace foi atingido e renovar o
        // cache
        if (this.valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
