package br.com.ciadono.model;

public enum Funcao {
	ATOR(2),
	DIRETOR(2),
	ILUMINADOR(1),
	SONOPLASTA(1);
	
	private int peso;

	private Funcao(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
}
