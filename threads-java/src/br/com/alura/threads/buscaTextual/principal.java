package br.com.alura.threads.buscaTextual;

public class principal {
	public static void main(String[] args) {
		
	
	String nome = "da";
	Thread threasAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
	Thread threasAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
	Thread threasAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));
	
	threasAssinaturas1.start();
	threasAssinaturas2.start();
	threasAutores.start();
	
	
	
	}
	
}
