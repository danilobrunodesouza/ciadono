package br.com.ciadono.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elenco {
	private List<Integrante> integrantes = new ArrayList<>();
	private double somaCaches = 0;
	private Espetaculo espetaculo;

	public List<Integrante> getIntegrantes() {
		return Collections.unmodifiableList(integrantes);
	}

	public double getSomaCaches() {
		somaCaches = 0;
		for (Integrante integrante : integrantes) {
			somaCaches += integrante.getCache();
		}
		return somaCaches;
	}

	public void adicionaIntegrante(Integrante integrante) {
		this.integrantes.add(integrante);
	}

	public void removeIntegrante(Integrante integrante) {
		this.integrantes.remove(integrante);
	}

	public Espetaculo getEspetaculo() {
		return espetaculo;
	}

	public int numeroDeIntegrantesComOPeso2() {
		int numPeso2 = 0;
		for (Integrante integrante : integrantes) {
			if (integrante.pegaPesoDoIntegrante() == 2) {
				numPeso2++;
			}
		}
		return numPeso2;
	}

}
