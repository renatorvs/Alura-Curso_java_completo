package br.com.bitebank.banco.arrays.teste;

public class TesteObject {
	
//SOBRE CARGO QUANDO UM METODO É REESCRITO VARIAS VEZES COM PARAMETRO DIFERENTES EXEMPLO METODO PRINTLN ACEITA TUDO
		 public static void main(String[] args) {
		 
		 
		 
		 int[] idades = new int[5];
		 
		 idades[0] = 73;
		 idades[1] = 51;
		 idades[2] = 23;
		 idades[3] = 13;
		 idades[4] = 0;
	
		 
		 int claraIdade =  idades[4];
		
		System.out.println(claraIdade);
		
		System.out.println(idades.length);
		
		System.out.println("array em java");

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i + 1;
			System.out.println(idades[i]);
		}
		
		
		
		
		
		
		
		 }
}
