package br.com.bitebank.banco.arrays.teste;

public class WrappersOutroTeste {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(28); // autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing
		
		
		Double dref = Double.valueOf(1.2); // autoboxing
		System.out.println(dref.intValue()); //unboxing
	}

}
