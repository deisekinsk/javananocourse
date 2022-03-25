package com.java;

public class TesteConta {
	
	public static void main(String[] args) {		
		
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();		
		Conta contaCorrente2 = new Conta(199883, 997862, 200);
		
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
		
		contaCorrente2.cliente.nome = "Joana";
		contaCorrente2.cliente.idade = 37;
		
		
		System.out.println("Conta Corrente \n"+ ("Nome: "+contaCorrente2.cliente.nome+"\n") + "Número: "+contaCorrente2.numero+"\n"+ "Saldo: "+contaCorrente2.saldo);
		System.out.println("***********************");
		System.out.println("Conta Corrente \n"+"Número:"+ contaCorrente.numero);
		System.out.println("Saldo: R$" + contaCorrente.saldo);
		System.out.println("Nome: "+contaCorrente.cliente.nome);
		System.out.println("***********************");
		contaCorrente.depositar(315.20);
		System.out.println("Depósito Concluído");
		System.out.println("Verifica Saldo: "+ contaCorrente.consultaSaldo()+"\nNome: "+ contaCorrente.cliente.nome);
		System.out.println("***********************");
		contaCorrente.retirar(1.05);
		System.out.println("Saque Concluído");
		System.out.println("Verifica Saldo: "+ contaCorrente.consultaSaldo()+"\nNome: "+ contaCorrente.cliente.nome);

		

		
		
	}

}
