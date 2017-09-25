package br.com.ciadono.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivroCaixa {

	private List<Registro> registos = new ArrayList<>();

	public List<Registro> getRegistos() {
		return Collections.unmodifiableList(registos);
	}
	
	public void adicionaO(Registro registro) {
		this.registos.add(registro);
	}
	
	public void removeO(Registro registro) {
		this.registos.remove(registro);
	}
}
