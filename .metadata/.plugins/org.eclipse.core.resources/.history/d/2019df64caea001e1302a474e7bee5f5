package com.juliocac.contas;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		ContaEspecial contaesp1 = new ContaEspecial();
		ContaInvestimento containvest1 = new ContaInvestimento();

		conta1.numero = 1;
		conta1.saldo = 10000;
		conta1.depositar(10000);
		conta2.numero = 2;
		conta2.saldo = 20000;
		
		contaesp1.limite = 20000;
		contaesp1.depositar(40000);
		contaesp1.sacar(20000);
		
		containvest1.taxa = 0.14;
		containvest1.prazo = 4;
		containvest1.depositar(4000);
		containvest1.aplicarInvestimento(2000);
		
		
		System.out.println("Número da conta 1: " + conta1.numero);
		System.out.println("Número da saldo 1: " + conta1.saldo);
		System.out.println("Número da conta 2: " + conta2.numero);
		System.out.println("Número da saldo 2: " + conta2.saldo);
		System.out.println("Limite da conta especial 1: " + contaesp1.limite);
		System.out.println("Saldo da conta especial 1: " + contaesp1.saldo);
		System.out.println("Saldo da conta investimento 1: " + containvest1.saldo);
	
		

	}

}