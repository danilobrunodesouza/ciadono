package br.com.ciadono.model;

import java.util.ArrayList;
import java.util.List;

public class Colaboradores {

	private List<Colaborador> colaboradores = new ArrayList<>();
	private double somaSalarios = 0;

	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void adicionaO(Colaborador colaborador) {
		this.colaboradores.add(colaborador);
	}

	public void removeO(Colaborador colaborador) {
		this.colaboradores.remove(colaborador);
	}

	public double fazASomaDosSalarios() {
		somaSalarios = 0;
		for (Colaborador colaborador : colaboradores) {
			somaSalarios += colaborador.getSalarioBase();
		}
		return somaSalarios;

	}

}
