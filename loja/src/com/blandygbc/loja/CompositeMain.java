package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.orcamento.ItemOrcamento;
import com.blandygbc.loja.orcamento.Orcamento;

public class CompositeMain {
    static Logger logger = Logger.getLogger(CompositeMain.class.getName());

    public static void main(String[] args) {
        logger.info("Design Pattern - Composite:\n");

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        logger.log(Level.INFO, "Antigo orçamento: {0} \n",
                antigo.getValor());
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        logger.log(Level.INFO, "Novo orçamento: {0} \n",
                novo.getValor());

        novo.adicionarItem(antigo);
        logger.log(Level.INFO, "O resultado do Compsite ao adicionar o orçamento antigo ao novo: {0} \n",
                novo.getValor());
    }
}
