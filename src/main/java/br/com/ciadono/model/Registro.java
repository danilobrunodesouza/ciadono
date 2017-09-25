package br.com.ciadono.model;

import java.time.LocalDate;

public class Registro {

	private LocalDate data;
	private String titulo;
	private String descricao;
	private double valor;
	private Tipo tipo;

	public Registro(LocalDate data, String titulo, String descricao, double valor, Tipo tipo) {
		this.data = data;
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

}
