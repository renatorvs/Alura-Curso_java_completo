package br.com.alura.bitebank;

import herdadoConta.Conta;
import herdadoConta.ContaCorrente;

public class Testebiblioteca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(112, 234);
		c.deposita(200);
		
	}

}
