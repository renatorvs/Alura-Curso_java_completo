package br.com.alura.threads.lista;

import java.util.ArrayList;
import java.util.List;

public class TarefaAdicionaElemento implements Runnable {
	private int numeroThread;
	private List<String> lista;
	

	public TarefaAdicionaElemento(List<String> lista, int numeroThread) {
		this.lista = lista;
		this.numeroThread = numeroThread;
}

	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			lista.add( "thread : " + numeroThread + " - " + i);
		}
	}

}
