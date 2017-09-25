package br.com.ciadono.model;

public class PagaOsColaboradores {

	public void pagaOs(Colaboradores colaboradores, double montante) {
		defineFormaDePagamentoParaOs(colaboradores, montante);

	}

	private void defineFormaDePagamentoParaOs(Colaboradores colaboradores, double montante) {
		if (montante >= colaboradores.fazASomaDosSalarios()) {
			pagaSalarioIntegral(colaboradores);
		} else {
			pagaPercentualDoSalario(colaboradores, montante);
		}
	}

	private void pagaSalarioIntegral(Colaboradores colaboradores) {
		for (Colaborador colaborador : colaboradores.getColaboradores()) {
			colaborador.recebeSalario(colaborador.getSalarioBase());
		}
	}

	private void pagaPercentualDoSalario(Colaboradores colaboradores, double montante) {
		double porcentagemDoSalario = montante / colaboradores.fazASomaDosSalarios();
		for (Colaborador colaborador : colaboradores.getColaboradores()) {
			colaborador.recebeSalario(colaborador.getSalarioBase() * porcentagemDoSalario);
		}
	}

}
