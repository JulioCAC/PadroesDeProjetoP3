package com.juliocac.app;

import com.juliocac.contas.*;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1, 2000);
		Conta conta2 = new Conta(2, 3000);

		ContaEspecial contaesp = new ContaEspecial(1, 45000, 50000);
		ContaInvestimento containvest = new ContaInvestimento(1, 4000, 2, 3);

		System.out.println("Número da conta 1: " + conta1.getNumero());
		System.out.println("Número da saldo 1: " + conta1.getSaldo());
		System.out.println("Número da conta 2: " + conta2.getNumero());
		System.out.println("Número da saldo 2: " + conta2.getSaldo());

		System.out.println("Limite da conta especial: " + contaesp.getLimite());
		System.out.println("Prazo da conta investimento: " + containvest.getPrazo());

	}

}