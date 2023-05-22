package com.blandygbc.loja.imposto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class ICMS extends Imposto {

    public ICMS(Imposto outro) {
        super(outro);
    }

    public ICMS() {
        super(null);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
