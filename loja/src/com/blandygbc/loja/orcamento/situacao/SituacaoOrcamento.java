package com.blandygbc.loja.orcamento.situacao;

import java.math.BigDecimal;

import com.blandygbc.loja.exception.DomainException;
import com.blandygbc.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento já foi aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento já foi reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("O orçamento já foi finalizado!");
    }
}
