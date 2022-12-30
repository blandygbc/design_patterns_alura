package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.imposto.CalculadoraDeImpostos;
import com.blandygbc.loja.imposto.ISS;
import com.blandygbc.loja.orcamento.Orcamento;

public class StrategyMain {
    static Logger logger = Logger.getLogger(StrategyMain.class.getName());

    public static void main(String[] args) {

        logger.info("Design Pattern - Strategy:\n");
        Orcamento orcamentoStrategy = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        logger.info("Calculando o valor de ISS sobre 100.\n");
        String resultStrategy = String.valueOf(calculadoraDeImpostos.calcular(orcamentoStrategy, new ISS()));
        logger.log(Level.INFO, "O resultado do Strategy calcular imposto de ISS: {0} \n", resultStrategy);

    }
}
