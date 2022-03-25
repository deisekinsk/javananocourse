package com.java;

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	
	
	Cliente cliente = new Cliente();
	
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	
	//Sobrecarga
	public Conta(int numero) {
		this.numero = numero;
		this.saldo = 0;
			
		}
	
	public Conta (double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	
	public double consultaSaldo() {
		return saldo;
	}
	
	
	
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumeroConta(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
			return numero;
	}

}
