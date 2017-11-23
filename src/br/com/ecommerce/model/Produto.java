package br.com.ecommerce.model;

import javax.persistence.*;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private Long codigo;
	
	@Column(length=1000)
	private String descricao;
	
	private String foto;
	private String categoria;
	private int destaque;
	private String especificacao;
	private double preco_unitario;
	
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public int getDestaque() {
		return destaque;
	}
	public void setDestaque(int destaque) {
		this.destaque = destaque;
	}
	
	

	
	
	

}
