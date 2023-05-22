package com.blandygbc.loja.imposto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public abstract class Imposto {
    private Imposto outro;

    protected Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        if (outro != null) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }

}
