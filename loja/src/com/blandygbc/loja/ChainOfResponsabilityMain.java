package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.desconto.CalculadoraDeDescontos;
import com.blandygbc.loja.orcamento.ItemOrcamento;
import com.blandygbc.loja.orcamento.Orcamento;

public class ChainOfResponsabilityMain {
    static Logger logger = Logger.getLogger(ChainOfResponsabilityMain.class.getName());

    public static void main(String[] args) {

        logger.info("Design Pattern - Chain of Responsability: \n");
        Orcamento orcamentoChOfRes1 = new Orcamento();
        for (int i = 0; i < 6; i++) {
            orcamentoChOfRes1.adicionarItem(new ItemOrcamento(new BigDecimal("25")));
        }
        Orcamento orcamentoChOfRes2 = new Orcamento();
        orcamentoChOfRes2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        logger.info("Calculando o desconto para orçamento de 150 com 6 itens.\n");
        String resultChOfRes1 = String.valueOf(calculadoraDeDescontos.calcular(orcamentoChOfRes1));
        logger.info("Calculando o desconto para orçamento maior que 500.\n");
        String resultChOfRes2 = String.valueOf(calculadoraDeDescontos.calcular(orcamentoChOfRes2));
        logger.log(Level.INFO, "O resultado do Chain of Responsability calcular desconto de 6 itens: {0} \n",
                resultChOfRes1);
        logger.log(Level.INFO, "O resultado do Chain of Responsability calcular desconto 1000 de valor: {0} \n",
                resultChOfRes2);

    }
}
