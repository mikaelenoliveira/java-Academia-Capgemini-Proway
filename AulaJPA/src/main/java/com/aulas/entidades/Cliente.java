package com.aulas.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "idcliente")
	private int id;
	@Column(length = 30, nullable = false)
	private String razaosocial;
	@Column(length = 16, nullable = false)
	private String cpf;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Venda> vendas;
	
	
	public Cliente() {
		
	}
	public Cliente(String razaosocial, String cpf) {
		this.razaosocial = razaosocial;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
