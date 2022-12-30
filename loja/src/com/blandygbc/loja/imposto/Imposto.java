package com.blandygbc.loja.imposto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
