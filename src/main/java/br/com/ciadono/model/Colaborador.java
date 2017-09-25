package br.com.ciadono.model;

public class Colaborador {
	private Long id;
	private String nome;
	private double salarioBase;
	private double salarioAReceber;
	private String senha;

	public Colaborador(String nome, double salarioBase, String senha) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getSalarioAReceber() {
		return salarioAReceber;
	}

	public String getSenha() {
		return senha;
	}

	public void recebeSalario(double salario) {
		this.salarioAReceber = salario;
	}

}