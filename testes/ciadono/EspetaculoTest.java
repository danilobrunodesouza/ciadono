package ciadono;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.ciadono.model.CalculaComissao;
import br.com.ciadono.model.CalculadoraDeCache;
import br.com.ciadono.model.DivideOsCachesIgualmente;
import br.com.ciadono.model.DivideOsCachesPorPeso;
import br.com.ciadono.model.Elenco;
import br.com.ciadono.model.Espetaculo;
import br.com.ciadono.model.FazORateioDosCaches;
import br.com.ciadono.model.Funcao;
import br.com.ciadono.model.Integrante;
import br.com.ciadono.model.Vendedor;

public class EspetaculoTest {

	@Test
	public void DeveAcertarAContaDoEspetaculoIgualmente() {

		Integrante i1 = new Integrante("Marcos", Funcao.ATOR);
		Integrante i2 = new Integrante("Kauan", Funcao.ATOR);
		Integrante i3 = new Integrante("Celina", Funcao.ATOR);
		Integrante i4 = new Integrante("Esdras", Funcao.DIRETOR);
		Vendedor v1 = new Vendedor("Juliano");

		Elenco elenco = new Elenco();

		elenco.adicionaIntegrante(i1);
		elenco.adicionaIntegrante(i2);
		elenco.adicionaIntegrante(i3);
		elenco.adicionaIntegrante(i4);

		Espetaculo espetaculo = new Espetaculo(elenco, 1000, 0, "Porcos", "Sabina", 10);
		CalculadoraDeCache calculadora = new DivideOsCachesIgualmente();
		espetaculo.adicionaVendedor(v1);

		CalculaComissao calculaComissao = new CalculaComissao();

		calculaComissao.calculaEPagaAComissao(espetaculo, espetaculo.getVendedores());

		FazORateioDosCaches rateio = new FazORateioDosCaches(espetaculo, elenco, calculadora);

		assertEquals(225, i1.getCache(), 0.0001);
		assertEquals(225, i2.getCache(), 0.0001);
		assertEquals(225, i3.getCache(), 0.0001);
		assertEquals(225, i4.getCache(), 0.0001);
		assertEquals(100, v1.getComissao(), 0.0001);

	}

	@Test
	public void DeveDividirCachePorPeso() {

		Integrante i1 = new Integrante("Marcos", Funcao.ATOR);
		Integrante i2 = new Integrante("Kauan", Funcao.ATOR);
		Integrante i3 = new Integrante("Celina", Funcao.ATOR);
		Integrante i4 = new Integrante("Esdras", Funcao.DIRETOR);
		Integrante i5 = new Integrante("Sila", Funcao.ILUMINADOR);
		Integrante i6 = new Integrante("Juliano", Funcao.SONOPLASTA);

		Elenco elenco = new Elenco();

		elenco.adicionaIntegrante(i1);
		elenco.adicionaIntegrante(i2);
		elenco.adicionaIntegrante(i3);
		elenco.adicionaIntegrante(i4);
		elenco.adicionaIntegrante(i5);
		elenco.adicionaIntegrante(i6);

		Espetaculo espetaculo = new Espetaculo(elenco, 1000, 0, "Porcos", "Sabina", 0);
		CalculadoraDeCache calculadora = new DivideOsCachesPorPeso();

		FazORateioDosCaches rateio = new FazORateioDosCaches(espetaculo, elenco, calculadora);

		assertEquals(200, i1.getCache(), 0.0001);
		assertEquals(200, i2.getCache(), 0.0001);
		assertEquals(200, i3.getCache(), 0.0001);
		assertEquals(200, i4.getCache(), 0.0001);
		assertEquals(100, i5.getCache(), 0.0001);
		assertEquals(100, i6.getCache(), 0.0001);

	}

	@Test
	public void DeveDividirCacheComVendedores() {

		Integrante i1 = new Integrante("Marcos", Funcao.ATOR);
		Integrante i2 = new Integrante("Kauan", Funcao.ATOR);

		Vendedor v1 = new Vendedor("Renata");

		Elenco elenco = new Elenco();

		elenco.adicionaIntegrante(i1);
		elenco.adicionaIntegrante(i2);

		Espetaculo espetaculo = new Espetaculo(elenco, 1200, 200, "Porcos", "Sabina", 10);
		espetaculo.adicionaVendedor(v1);

		CalculaComissao calculaComissao = new CalculaComissao();
		calculaComissao.calculaEPagaAComissao(espetaculo, espetaculo.getVendedores());

		CalculadoraDeCache calculadora = new DivideOsCachesPorPeso();

		FazORateioDosCaches rateio = new FazORateioDosCaches(espetaculo, elenco, calculadora);

		assertEquals(450, i1.getCache(), 0.0001);
		assertEquals(450, i2.getCache(), 0.0001);
		assertEquals(100, v1.getComissao(), 0.0001);
		assertEquals(elenco.getSomaCaches(), espetaculo.valorASerRateado(), 0.0001);
	}

}
