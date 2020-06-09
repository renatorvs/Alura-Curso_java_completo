package br.com.alura.threads.banheiro;

public class Banheiro {
	// synchronized dois metodos acessao mesmo objeto sibcronizando o acessoa ao objeto
	public void fazNumero1() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println("batendo na porta");

		synchronized (this) {
			System.out.println(nome + "  entrando na banheiro");
			System.out.println(nome + "  fazendo coisa rapido ");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(nome + "  dando  descarga");

			System.out.println(nome + "  lavando a mão  descarga");
			System.out.println(nome + "  saindo do banheiro ");
		}
		
	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println("batendo na porta");

		synchronized (this) {
			System.out.println(nome + "  entrando na banheiro");
			System.out.println(nome + "  fazendo coisa demorada ");
	
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
			System.out.println(nome + "  dando  descarga");
	
			System.out.println(nome + "  lavando a mão  descarga");
			System.out.println(nome + "  saindo do banheiro ");
		}
	}
}
