package br.com.ciadono.model;

public class DivideOsCachesPorPeso implements CalculadoraDeCache {

	@Override
	public double calcula(Integrante integrante, Espetaculo espetaculo) {
		double cacheUnitario = calculaCacheUnitario(espetaculo);

		double cache = cacheUnitario * integrante.pegaPesoDoIntegrante();

		return cache;
	}

	private double calculaCacheUnitario(Espetaculo espetaculo) {
		double valorASerRateado = espetaculo.valorASerRateado();
		int numIntegrantes = espetaculo.pegaONumeroDeIntegrantesNoElenco();
		int numIntegrantesPeso2 = espetaculo.getElenco().numeroDeIntegrantesComOPeso2();

		double cacheUnitario = valorASerRateado / (numIntegrantes + numIntegrantesPeso2);

		return cacheUnitario;

		
	}

}
