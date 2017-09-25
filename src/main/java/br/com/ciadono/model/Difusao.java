package br.com.ciadono.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Difusao {

	private List<Grupo> grupos = new ArrayList<>();
		
	public List<Grupo> getGrupos() {
		return Collections.unmodifiableList(grupos);
	}
	
	public void adicionaO(Grupo grupo) {
		this.grupos.add(grupo);
	}
	
	public void removeO(Grupo grupo) {
		this.grupos.remove(grupo);
	}
}
