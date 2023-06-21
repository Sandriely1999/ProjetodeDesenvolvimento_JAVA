package br.com.livraria.models;

import java.time.LocalDate;

public class Relatorio {
	
	private String nomeLivro;
	private String autor;
	private Double precoOriginal;
	private Double precoPromocional;
	private Double porcentagemAplicada;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	
	public Relatorio(String nomeLivro, String autor, Double precoOriginal, Double precoPromocional,
			Double porcentagemAplicada, LocalDate dataInicio, LocalDate dataFim) {
		super();
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.precoOriginal = precoOriginal;
		this.precoPromocional = precoPromocional;
		this.porcentagemAplicada = porcentagemAplicada;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	
	@Override
	public String toString() {
		return "Relatorio Nome do Livro = " + nomeLivro + ", Autor = " + autor + ", Preco Original = " + precoOriginal
				+ ", Preco Promocional = " + precoPromocional + ", Porcentagem Aplicada = " + porcentagemAplicada
				+ ", Data Inicio = " + dataInicio + ", Data Fim = " + dataFim + ".";
	}


	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPrecoOriginal() {
		return precoOriginal;
	}
	public void setPrecoOriginal(Double precoOriginal) {
		this.precoOriginal = precoOriginal;
	}
	public Double getPrecoPromocional() {
		return precoPromocional;
	}
	public void setPrecoPromocional(Double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
	public Double getPorcentagemAplicada() {
		return porcentagemAplicada;
	}
	public void setPorcentagemAplicada(Double porcentagemAplicada) {
		this.porcentagemAplicada = porcentagemAplicada;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	
	



}
