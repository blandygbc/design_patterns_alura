package com.blandygbc.loja.desconto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class DescontoValorMaiorQue500 extends Desconto {

    public DescontoValorMaiorQue500(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0)
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        return proximo.calcular(orcamento);
    }

}
