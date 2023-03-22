package com.blandygbc.loja.orcamento;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.situacao.EmAnalise;
import com.blandygbc.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
    private BigDecimal valor;
    private Integer quantidadeDeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public Orcamento(BigDecimal bigDecimal) {
        this.valor = bigDecimal;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setSituacao(SituacaoOrcamento situacaoOrcamento) {
        this.situacao = situacaoOrcamento;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }
}
