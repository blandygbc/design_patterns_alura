package com.blandygbc.loja;

import java.math.BigDecimal;

import com.blandygbc.loja.http.ApiHttpClient;
import com.blandygbc.loja.orcamento.Orcamento;
import com.blandygbc.loja.orcamento.RegistroDeOrcamento;

public class AdapterMain {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new ApiHttpClient());
        registroDeOrcamento.regitrar(orcamento);

    }
}
