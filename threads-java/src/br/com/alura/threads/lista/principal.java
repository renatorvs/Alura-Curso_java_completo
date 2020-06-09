package br.com.alura.threads.lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class principal {
	public static void main(String[] args) throws Exception {
		

		// List<String> lista = Collections.synchronizedList(new ArrayList<String>());
	 List<String> lista = new Vector<String>();
		for (int i = 0; i < 10 ; i++) {
			Thread thread	 = new Thread( new TarefaAdicionaElemento(lista, i));
			thread.start();
		}
		
		Thread.sleep(2000);
		
		for (int i = 0; i < lista.size(); i++){
			System.out.println(i + " - " + lista.get(i));
		}
		
	}
}
