package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tarefas")
public class Tarefas {

	@Id
	@GeneratedValue
	private Long id;
	
	
	private boolean finalizado;
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizacao;
	
	
	
	public Long getId() {
		return id;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public String getDescricao() {
		return descricao;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	
	
}
