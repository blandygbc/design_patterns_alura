package com.blandygbc.loja.orcamento;

import java.util.Map;

import com.blandygbc.loja.exception.DomainException;
import com.blandygbc.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void regitrar(Orcamento orcamento) {
        if (orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }
        String url = "http://api.externa.com/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeDeItens());
        http.post(url, dados);
    }
}
