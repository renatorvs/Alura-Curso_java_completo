package br.com.alura.maven;

public class Produtos {
	private final String nome;
	private final double preco;
	
	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}


	public Object getPrecoComImposto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
