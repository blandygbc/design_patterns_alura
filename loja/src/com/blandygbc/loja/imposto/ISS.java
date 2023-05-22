package com.blandygbc.loja.imposto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class ISS extends Imposto {

    public ISS(Imposto outro) {
        super(outro);
    }

    public ISS() {
        super(null);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
