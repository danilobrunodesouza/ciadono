package br.com.ciadono.components;

import java.io.Serializable;

import br.com.ciadono.entity.Usuario;

public class UsuarioSession implements Serializable {
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		//usuario.cleanUP();
		this.usuario = usuario;
	}
	
	
}
