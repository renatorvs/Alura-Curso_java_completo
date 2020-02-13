package br.com.bitebank.banco.arrays.teste;

import br.com.bitebank.banco.modelo.Conta;
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.SaldoInsuficienteException;


///   public class TesteSacaComExceptions  publico para outros pacotes
public class TesteSacaComExceptions {
			public static void main(String[] args) {
				Conta conta = new ContaCorrente(123, 321);
				conta.deposita(200);
				try {
					conta.saca(210);
					
				} catch (SaldoInsuficienteException ex) {
					System.out.println("ex peguei a exception: " + ex.getMessage());
				}
			
				System.out.println(conta.getSaldo() );
			}
}
