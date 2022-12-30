package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.imposto.CalculadoraDeImpostos;
import com.blandygbc.loja.imposto.ISS;
import com.blandygbc.loja.orcamento.Orcamento;

public class App {
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        // Strategy
        logger.info("Design Pattern - Strategy:");
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        logger.info("Calculando o valor de ISS sobre 100.");
        String result1 = String.valueOf(calculadoraDeImpostos.calcular(orcamento, new ISS()));
        logger.log(Level.INFO, "O resultado do Strategy calcular imposto de ISS: {0}", result1);
    }
}
