package br.com.bitebank.banco.arrays.teste;

import br.com.bitebank.banco.modelo.CalculadorImposto;
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.SeguraDeVida;

public class mainTributaveis {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100, 100);
		cc.deposita(100);
		
		SeguraDeVida sv = new SeguraDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}
}
