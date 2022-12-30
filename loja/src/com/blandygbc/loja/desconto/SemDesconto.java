package com.blandygbc.loja.desconto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

}
