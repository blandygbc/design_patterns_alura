package com.blandygbc.loja;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.blandygbc.loja.orcamento.ItemOrcamento;
import com.blandygbc.loja.orcamento.Orcamento;
import com.blandygbc.loja.orcamento.OrcamentoProxy;

public class ProxyMain {
        static Logger logger = Logger.getLogger(ProxyMain.class.getName());

        public static void main(String[] args) {
                logger.info("Design Pattern - Proxy:\n");

                Orcamento antigo = new Orcamento();
                antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
                antigo.reprovar();
                Orcamento novo = new Orcamento();
                novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
                novo.adicionarItem(antigo);

                OrcamentoProxy proxy = new OrcamentoProxy(novo);
                logger.log(Level.INFO, "O resultado do tempo de acesso ao valor 1: {0} \n",
                                proxy.getValor());
                logger.log(Level.INFO, "O resultado do tempo de acesso ao valor 2: {0} \n",
                                proxy.getValor());
                logger.log(Level.INFO, "O resultado do tempo de acesso ao valor 3: {0} \n",
                                proxy.getValor());
                logger.log(Level.INFO, "O resultado do tempo de acesso ao valor 4: {0} \n",
                                proxy.getValor());
        }
}
