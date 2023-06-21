package br.com.livraria.models;

import java.time.LocalDate;

public class Promocao {
	
	private String tipoPromocao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Double pctDesconto;
	
	
	public Promocao(String tipoPromocao, LocalDate dataInicio, LocalDate dataFim, Double pctDesconto) {
		super();
		this.tipoPromocao = tipoPromocao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.pctDesconto = pctDesconto;
	}
	
	public Promocao() {
		
	}
	public String getTipoPromocao() {
		return tipoPromocao;
	}
	public void setTipoPromocao(String tipoPromocao) {
		this.tipoPromocao = tipoPromocao;
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
	public Double getPctDesconto() {
		return pctDesconto;
	}
	public void setPctDesconto(Double pctDesconto) {
		this.pctDesconto = pctDesconto;
	}
	
	
	

}
