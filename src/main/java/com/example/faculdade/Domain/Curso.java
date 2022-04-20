package com.example.faculdade.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nomecurso;
	private String duracao;
	
	public Curso() {
		
	}
	
	public Curso(Long id, String nomecurso, String duracao) {
		this.id = id;
		this.nomecurso = nomecurso;
		this.duracao = duracao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nomecurso=" + nomecurso + ", duracao=" + duracao + "]";
	}	

}
