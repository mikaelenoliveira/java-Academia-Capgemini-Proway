package com.aulas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "idcategoria")
	private int id;
	@Column(length = 30, nullable = false)
	private String descricao;
	
		
	public Categoria() {
		
	}
	public Categoria(String descricao) {
		
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
