package br.com.ciadono.entity;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private Long id;
	private String login;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public void cleanUP () {
		
	}
}