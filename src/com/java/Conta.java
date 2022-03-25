package com.java;

public class Conta {
	
	int numero;
	double saldo;
	int agencia;
	
	Cliente cliente = new Cliente();
	
	public Conta() {
		
	}
	//Sobrecarga
	public Conta(int numero) {
		this.numero = numero;
		this.saldo = 0;
			
		}
	
	public Conta (double saldo) {
		this.saldo = saldo;
	}
	
	public Conta (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public double recuperaSaldo() {
		return saldo;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
	
	public void retirar(double valor) {
		saldo = saldo -valor;
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
