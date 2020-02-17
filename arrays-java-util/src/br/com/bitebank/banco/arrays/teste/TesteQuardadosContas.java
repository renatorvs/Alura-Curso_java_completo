package br.com.bitebank.banco.arrays.teste;

import br.com.bitebank.banco.modelo.Conta;
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.QuardadosContas;

public class TesteQuardadosContas {
	public static void main(String[] args) {
		QuardadosContas quardados = new QuardadosContas();
		
		Conta cc = new ContaCorrente(22, 11);
		
		Conta cc2 = new ContaCorrente(232, 131);
		
		
		
		quardados.adiciona(cc);
		quardados.adiciona(cc2);
		
		
		
	 int tamanho = quardados.getquantidadeContas();
	 System.out.println(tamanho);
		
	 Conta ref = quardados.getReferencia(0);
	 
	 System.out.println(ref.getNumero());
	}
	
}
