package com.blandygbc.loja.imposto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class ICMS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
