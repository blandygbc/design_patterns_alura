package com.blandygbc.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.blandygbc.loja.orcamento.situacao.EmAnalise;
import com.blandygbc.loja.orcamento.situacao.Finalizado;
import com.blandygbc.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public Orcamento(BigDecimal bigDecimal) {
        this.valor = bigDecimal;
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

    public List<Orcavel> getItens() {
        return itens;
    }

    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }

    public Integer getQuantidadeDeItens() {
        return itens.size();
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

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }
}
