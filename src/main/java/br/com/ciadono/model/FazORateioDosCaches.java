package br.com.ciadono.model;

public class FazORateioDosCaches {

	public FazORateioDosCaches(Espetaculo espetaculo, Elenco elenco, CalculadoraDeCache calculadora) {
		
		for (Integrante integrante : elenco.getIntegrantes()) {
			double valorDoRateio = calculadora.calcula(integrante, espetaculo);
			integrante.recebeOCache(valorDoRateio);

		}

	}
	
}
