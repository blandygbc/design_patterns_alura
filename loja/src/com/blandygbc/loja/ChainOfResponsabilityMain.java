package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.desconto.CalculadoraDeDescontos;
import com.blandygbc.loja.orcamento.Orcamento;

public class ChainOfResponsabilityMain {
    static Logger logger = Logger.getLogger(ChainOfResponsabilityMain.class.getName());

    public static void main(String[] args) {

        logger.info("Design Pattern - Chain of Responsability: \n");
        Orcamento orcamentoChOfRes1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamentoChOfRes2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        logger.info("Calculando o desconto para orçamento de 200 com 6 itens.\n");
        String resultChOfRes1 = String.valueOf(calculadoraDeDescontos.calcular(orcamentoChOfRes1));
        String resultChOfRes2 = String.valueOf(calculadoraDeDescontos.calcular(orcamentoChOfRes2));
        logger.log(Level.INFO, "O resultado do Chain of Responsability calcular desconto de 5 itens: {0} \n",
                resultChOfRes1);
        logger.log(Level.INFO, "O resultado do Chain of Responsability calcular desconto 1000 de valor: {0} \n",
                resultChOfRes2);

    }
}
