package br.com.bitebank.banco.arrays.teste;

public interface TesteArgsMain {
	public static void main(String[] args) {

             System.out.println("Funcionou!!");

             for(int i = 0; i < args.length; i++) {
                 System.out.println(args[i]);
             }
   
	}
}
