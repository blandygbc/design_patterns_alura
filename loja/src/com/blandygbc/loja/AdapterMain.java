package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Logger;

import com.blandygbc.loja.http.ApiHttpClient;
import com.blandygbc.loja.orcamento.Orcamento;
import com.blandygbc.loja.orcamento.RegistroDeOrcamento;

public class AdapterMain {
    static Logger logger = Logger.getLogger(AdapterMain.class.getName());

    public static void main(String[] args) {
        logger.info("Design Pattern - Adapter:\n");
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        // Vai lançar exception, pois o endereço da API é fake
        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new ApiHttpClient());
        registroDeOrcamento.regitrar(orcamento);

    }
}
