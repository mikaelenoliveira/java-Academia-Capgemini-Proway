package com.aulas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrinho")
public class Carrinho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "idcarrinho")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idvenda")
	private Venda venda;
	@ManyToOne
	@JoinColumn(name="idproduto")
	private Produto produto;
	
	private Float preco;
	private Float quantidade;
	
		
	public Carrinho() {
		
	}
	public Carrinho(Venda venda, Produto produto, Float preco, Float quantidade) {
		this.venda = venda;
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}	
	
	

}
