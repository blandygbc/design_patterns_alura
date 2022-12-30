package com.blandygbc.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;

    public Orcamento(BigDecimal bigDecimal) {
        this.valor = bigDecimal;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
