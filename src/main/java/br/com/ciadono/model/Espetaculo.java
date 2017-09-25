package br.com.ciadono.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Espetaculo {
	private String titulo;
	private double renda;
	private double custo;
	private double lucro;
	private String local;
	private Elenco elenco;
	private double percentualDeComissao;
	private List<Vendedor> vendedores = new ArrayList<>();

	public Espetaculo(Elenco elenco, double renda, double custo, String titulo, String local,
			double percentualDeComissao) {
		this.elenco = elenco;
		this.renda = renda;
		this.custo = custo;
		this.titulo = titulo;
		this.local = local;
		this.percentualDeComissao = percentualDeComissao / 100;
		this.lucro = renda - custo;
	}

	public double valorASerRateado() {
		return lucro - lucro * percentualDeComissao;
	}

	public List<Vendedor> getVendedores() {
		return Collections.unmodifiableList(vendedores);
	}

	public Elenco getElenco() {
		return elenco;
	}

	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}

	public double getLucro() {
		return lucro;
	}

	public double getRenda() {
		return renda;
	}

	public double getCusto() {
		return custo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getLocal() {
		return local;
	}

	public void adicionaVendedor(Vendedor vendedor) {
		this.vendedores.add(vendedor);
	}

	public void removeVendedor(Vendedor vendedor) {
		this.vendedores.remove(vendedor);
	}

	public int pegaONumeroDeIntegrantesNoElenco() {
		return this.getElenco().getIntegrantes().size();
	}

}