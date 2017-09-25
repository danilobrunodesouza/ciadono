package br.com.ciadono.model;

public class Integrante {
	private String nome;
	private Funcao funcao;
	private double cache;
	
	public Integrante(String nome, Funcao funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public double getCache() {
		return cache;
	}
	
	public void recebeOCache(double cache) {
		this.cache = cache;
	}
	public int pegaPesoDoIntegrante() {
		return this.getFuncao().getPeso();		
	}
}
