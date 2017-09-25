package br.com.ciadono.model;

public class Vendedor {
	private double comissao;
	private String nome;

	public Vendedor(String nome) {
		this.nome = nome;
	}

	public double getComissao() {
		return comissao;
	}

	public String getNome() {
		return nome;
	}

	public void recebeComissao(double comissao) {
		this.comissao = comissao;
	}
}
