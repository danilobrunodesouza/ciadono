package br.com.ciadono.model;

public class DivideOsCachesIgualmente implements CalculadoraDeCache {

	@Override
	public double calcula(Integrante integrante, Espetaculo espetaculo) {
		double cache = espetaculo.valorASerRateado() / espetaculo.pegaONumeroDeIntegrantesNoElenco();

		return cache;

	}

	
}
