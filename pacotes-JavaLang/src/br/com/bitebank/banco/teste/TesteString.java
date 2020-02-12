package br.com.bitebank.banco.teste;

public class TesteString {
	  public static void main(String[] args) {
		  
		 // String nome = "alura";  // OBJETO LITERAL
		  
		  //String Outronome = new String("alura");
		  
		  
		  String nome = "Alura";

		  String nomemodify  = nome.replace("A", "a");

		  
//		  	char c = nome.charAt(0);
//	        System.out.println(" indice de letra apenas uma  " + c);
	        
	        
//	        int pos = nome.indexOf("ur");
//	        System.out.println(" indice de letra apenas uma  " + pos);

//	        
//	        String sub = nome.substring(1);
//	        System.out.println("tira primeira letra da string " +  sub);
		  
		  
		 System.out.println("Tamho de letras" +nome.length());
		 
		 String palavras = "";
		 System.out.println("veriffica se esta vazio volta boolean " + palavras.isEmpty());
		 

for(int i = 0; i < nome.length(); i++) {
    System.out.println(nome.charAt(i));
}
		 

String vazio ="    Alura    ";
String outroVazio = vazio.trim(); 

System.out.println(" Verifica esse trecho no verifica se conte Return boolean " + vazio.contains("Alu"));
		 
		 String espace = "   ONCLICKUP    ";
	     System.out.println(espace);

		String tiraEspece = espace.trim();
     System.out.println(tiraEspece);
  
		
		
//	        System.out.println(nome);
//	        System.out.println(nomemodify);
		  
//	        String outroLowerNome = nome.toLowerCase();
//	        String outroUpperNome = nome.toUpperCase();
	        
//	        System.out.println("Tudo minusculo" + outroLowerNome);
//	        System.out.println("Tudo maiusculo "+ outroUpperNome);
        
	        
	        char q = 'A';
	        
	        
	        
	        
	        

		  
	}
}
