package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		Conta contaCorrente2 = new Conta(997862, 200);
		
		contaCorrente.numero = 111;
		contaCorrente.saldo = 11.80;
		contaCorrente.cliente.nome = "Deise";
		contaCorrente.cliente.idade = 34;
		
		
		contaPoupanca.numero = 222;
		contaPoupanca.saldo = 500.30;
		contaPoupanca.cliente.nome = "Silva";
		contaPoupanca.cliente.idade = 48;		
				
		contaInvestimento.numero = 333;
		contaInvestimento.saldo = 1037.90;
		contaInvestimento.cliente.nome = "Odyá Ltda";
		contaInvestimento.cliente.idade = 15;
		
		System.out.println("CC: "+ contaCorrente.numero);
		System.out.println("Saldo: R$" + contaCorrente.saldo);
		System.out.println("Nome: "+contaCorrente.cliente.nome);
		System.out.println("CC: "+contaCorrente2.numero+", "+contaCorrente2.saldo);

		
		
	}

}
