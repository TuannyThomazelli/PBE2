package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto", nullable = false)
	private Long id_produto;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "preco", nullable = false)
	private Double preco;
	
	@Column(name = "cor", nullable = false)
	private String cor;
	
	public Produto() {
		
	}

	// Construtores
	public Produto(Long id_produto, String nome, Double preco, String cor) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
	}
	// Getters e Setters
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	

}
