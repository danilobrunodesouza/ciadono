package br.com.ciadono.model;

import java.util.List;

public class CalculaComissao {

	public void calculaEPagaAComissao(Espetaculo espetaculo, List<Vendedor> vendedores) {

		double comissao = calculaValorDaComissaoPorVendedor(espetaculo);

		pagaComissaoParaTodosVendedores(vendedores, comissao);
	}

	private void pagaComissaoParaTodosVendedores(List<Vendedor> vendedores, double comissao) {
		for (Vendedor vendedor : vendedores) {
			pagaAComissaoAoVendedor(vendedor, comissao);
		}
	}

	private void pagaAComissaoAoVendedor(Vendedor vendedor, double comissao) {
		vendedor.recebeComissao(comissao);
	}

	private double calculaValorDaComissaoPorVendedor(Espetaculo espetaculo) {
		double comissao = (espetaculo.getPercentualDeComissao() * espetaculo.getLucro())
				/ espetaculo.getVendedores().size();
		return comissao;
	}
}
