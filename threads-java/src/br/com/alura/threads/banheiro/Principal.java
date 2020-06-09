package br.com.alura.threads.banheiro;

public class Principal {
	public static void main(String[] args) {
		
		// sicronizando Thread compartilahndo mesmo onjeto com dois traead sincronizando o acesso ao mesmo objeto chamado de mutex
		
		Banheiro  banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Leonardo");
		Thread convidado2 = new Thread(new TarefaNumero1(banheiro), "Renato");
		convidado1.start();
		convidado2.start();
		
	}

}
