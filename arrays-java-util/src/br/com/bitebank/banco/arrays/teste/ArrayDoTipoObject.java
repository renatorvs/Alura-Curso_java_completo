package br.com.bitebank.banco.arrays.teste;

import br.com.bitebank.banco.modelo.Cliente;
import br.com.bitebank.banco.modelo.Conta;
import br.com.bitebank.banco.modelo.ContaCorrente;

public class ArrayDoTipoObject {
	public static void main(String[] args) {
		
	Conta[] contas = new Conta[10];
	
	ContaCorrente cp1 = new ContaCorrente(11,22);
	ContaCorrente cp2 = new ContaCorrente(33,44);

	contas[0] = cp1;
	contas[1] = cp1;
	contas[4] = cp2;
	contas[5] = cp2;

	
	Cliente cli = new Cliente();
	
	
	ContaCorrente ref1 = (ContaCorrente) contas[1];
	ContaCorrente ref2 = (ContaCorrente) contas[4];
    System.out.println(contas[1].getNumero());
    
	}
    
    
}
