package br.com.livraria.models;

public class Livro {
	
	private String nome;
	private String autor;
	private Double preco;
	private Promocao tipoPromocao;
	
	
	public Livro(String nome, String autor, Double preco, Promocao tipoPromocao) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.tipoPromocao = tipoPromocao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Promocao getTipoPromocao() {
		return tipoPromocao;
	}
	public void setTipoPromocao(Promocao tipoPromocao) {
		this.tipoPromocao = tipoPromocao;
	}
	
	
	

}
