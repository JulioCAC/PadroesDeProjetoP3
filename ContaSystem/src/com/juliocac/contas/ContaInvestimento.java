package com.juliocac.contas;

public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;
    
    public boolean aplicarInvestimento(double montante) {
        if (taxa < 0 || prazo <= 0) {
            return false;
        }

        montante = this.saldo * Math.pow(1 + taxa, prazo);
        this.saldo = montante;
        
        return true; 
    }
}
