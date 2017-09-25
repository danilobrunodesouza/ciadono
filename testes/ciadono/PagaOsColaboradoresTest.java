package ciadono;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.ciadono.model.Colaborador;
import br.com.ciadono.model.Colaboradores;
import br.com.ciadono.model.PagaOsColaboradores;

public class PagaOsColaboradoresTest {

	@Test
	public void deveAcertarAContaDaDivisaoDosSalariosIntegrais() {

		Colaborador c1 = new Colaborador("Juliano", 1000, "jaPegueiTodoMundo");
		Colaborador c2 = new Colaborador("Marcos", 1000, "jaPegueiTodoMundo");
		Colaborador c3 = new Colaborador("Renata", 1000, "jaPegueiTodoMundo");
		Colaborador c4 = new Colaborador("Sila", 1000, "jaPegueiTodoMundo");
		Colaborador c5 = new Colaborador("Esdras", 1000, "jaPegueiTodoMundo");

		Colaboradores colaboradores = new Colaboradores();

		colaboradores.adicionaO(c1);
		colaboradores.adicionaO(c2);
		colaboradores.adicionaO(c3);
		colaboradores.adicionaO(c4);
		colaboradores.adicionaO(c5);

		double montante = 10000;
		PagaOsColaboradores pagaOsColaboradores = new PagaOsColaboradores();

		pagaOsColaboradores.pagaOs(colaboradores, montante);

		assertEquals(1000, c1.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c2.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c3.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c4.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c5.getSalarioAReceber(), 0.0001);

	}

	@Test
	public void deveAcertarAContaDaDivisaoDosSalariosPercentuais() {

		Colaborador c1 = new Colaborador("Juliano", 1000, "jaPegueiTodoMundo");
		Colaborador c2 = new Colaborador("Marcos", 1000, "jaPegueiTodoMundo");
		Colaborador c3 = new Colaborador("Renata", 1000, "jaPegueiTodoMundo");
		Colaborador c4 = new Colaborador("Sila", 1000, "jaPegueiTodoMundo");
		Colaborador c5 = new Colaborador("Esdras", 1000, "jaPegueiTodoMundo");

		Colaboradores colaboradores = new Colaboradores();

		colaboradores.adicionaO(c1);
		colaboradores.adicionaO(c2);
		colaboradores.adicionaO(c3);
		colaboradores.adicionaO(c4);
		colaboradores.adicionaO(c5);

		double montante = 2500;
		PagaOsColaboradores pagaOsColaboradores = new PagaOsColaboradores();

		pagaOsColaboradores.pagaOs(colaboradores, montante);

		assertEquals(500, c1.getSalarioAReceber(), 0.0001);
		assertEquals(500, c2.getSalarioAReceber(), 0.0001);
		assertEquals(500, c3.getSalarioAReceber(), 0.0001);
		assertEquals(500, c4.getSalarioAReceber(), 0.0001);
		assertEquals(500, c5.getSalarioAReceber(), 0.0001);

	}

	@Test
	public void deveAcertarAContaDaDivisaoDosSalariosIntegraisComValoresDiferentes() {

		Colaborador c1 = new Colaborador("Juliano", 2000, "jaPegueiTodoMundo");
		Colaborador c2 = new Colaborador("Marcos", 500, "jaPegueiTodoMundo");
		Colaborador c3 = new Colaborador("Renata", 1000, "jaPegueiTodoMundo");
		Colaborador c4 = new Colaborador("Sila", 1000, "jaPegueiTodoMundo");
		Colaborador c5 = new Colaborador("Esdras", 500, "jaPegueiTodoMundo");

		Colaboradores colaboradores = new Colaboradores();

		colaboradores.adicionaO(c1);
		colaboradores.adicionaO(c2);
		colaboradores.adicionaO(c3);
		colaboradores.adicionaO(c4);
		colaboradores.adicionaO(c5);

		double montante = 5000;
		PagaOsColaboradores pagaOsColaboradores = new PagaOsColaboradores();

		pagaOsColaboradores.pagaOs(colaboradores, montante);

		assertEquals(2000, c1.getSalarioAReceber(), 0.0001);
		assertEquals(500, c2.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c3.getSalarioAReceber(), 0.0001);
		assertEquals(1000, c4.getSalarioAReceber(), 0.0001);
		assertEquals(500, c5.getSalarioAReceber(), 0.0001);

	}

	@Test
	public void deveAcertarAContaDaDivisaoDosSalariosPercentuaisComValoresDiferentes() {

		Colaborador c1 = new Colaborador("Juliano", 2000, "jaPegueiTodoMundo");
		Colaborador c2 = new Colaborador("Marcos", 500, "jaPegueiTodoMundo");
		Colaborador c3 = new Colaborador("Renata", 1000, "jaPegueiTodoMundo");
		Colaborador c4 = new Colaborador("Sila", 1000, "jaPegueiTodoMundo");
		Colaborador c5 = new Colaborador("Esdras", 500, "jaPegueiTodoMundo");

		Colaboradores colaboradores = new Colaboradores();

		colaboradores.adicionaO(c1);
		colaboradores.adicionaO(c2);
		colaboradores.adicionaO(c3);
		colaboradores.adicionaO(c4);
		colaboradores.adicionaO(c5);

		double montante = 2500;
		PagaOsColaboradores pagaOsColaboradores = new PagaOsColaboradores();

		pagaOsColaboradores.pagaOs(colaboradores, montante);

		assertEquals(1000, c1.getSalarioAReceber(), 0.0001);
		assertEquals(250, c2.getSalarioAReceber(), 0.0001);
		assertEquals(500, c3.getSalarioAReceber(), 0.0001);
		assertEquals(500, c4.getSalarioAReceber(), 0.0001);
		assertEquals(250, c5.getSalarioAReceber(), 0.0001);

	}

}
