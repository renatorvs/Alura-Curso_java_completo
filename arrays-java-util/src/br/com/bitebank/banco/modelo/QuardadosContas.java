package br.com.bitebank.banco.modelo;

public class QuardadosContas {
	private Conta[] referencias;
	private int lastPosition;
	
	public QuardadosContas() {
		this.referencias = new Conta[10];
		this.lastPosition = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[lastPosition] = ref;
		this.lastPosition++;
	}

	public int getquantidadeContas() {
		return this.lastPosition;
	}

	public Conta getReferencia(int position) {
		return this.referencias[position] ;
	}
}
