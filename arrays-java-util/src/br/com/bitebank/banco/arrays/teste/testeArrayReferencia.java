package br.com.bitebank.banco.arrays.teste;

import br.com.bitebank.banco.modelo.ContaCorrente;

public class testeArrayReferencia {

		public static void main(String[] args) {
			
		    //int[] idades = new int[5];
	//		array do objeto contaCorrente com 5 posições
ContaCorrente[] contas = new ContaCorrente[10];
			
			ContaCorrente cp1 = new ContaCorrente(11,22);
			ContaCorrente cp2 = new ContaCorrente(33,44);

			contas[0] = cp1;
			contas[1] = cp1;
			contas[4] = cp2;
			contas[5] = cp2;

			ContaCorrente ref1 = contas[1];
			ContaCorrente ref2 = contas[4];
		    System.out.println(contas[1].getNumero());
		    
		    
		    int[] numeros = new int[6];
		    numeros[0] = 1;
		    numeros[1] = 2;
		    numeros[2] = 3;
		    numeros[3] = 4;
		    numeros[4] = 5;
		    
		    
		    int[] refsOutraForma = {1,2,3,4,5};
/////////////////////////
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
}
