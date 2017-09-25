package br.com.ciadono.model;

import java.time.LocalDate;

public class Grupo {

	private String nome;
	private String peca;
	private LocalDate data;
	private double contribuicao;
	
	
	

	public String getNome() {
		return nome;
	}

	public String getPeca() {
		return peca;
	}

	public LocalDate getData() {
		return data;
	}

	public double getContribuicao() {
		return contribuicao;
	}
}
