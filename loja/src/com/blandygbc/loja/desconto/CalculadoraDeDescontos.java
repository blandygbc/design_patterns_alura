package com.blandygbc.loja.desconto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoMaisDeCincoItens(
                new DescontoValorMaiorQue500(
                        new SemDesconto()));
        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }
}
