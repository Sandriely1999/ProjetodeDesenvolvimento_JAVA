package br.com.livraria.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.livraria.models.Livro;
import br.com.livraria.models.Promocao;

public class LerArquivo {
	
	private static List <Promocao> listaPromocao = new ArrayList<Promocao>();
	public static List <Livro> listaLivros = new ArrayList <Livro>();
	
	public static void lerArquivoLivro() throws IOException {
		Path arquivo = Paths.get("livros.csv");
		List <String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 1; i < linhas.size(); i++ ) {
			String linhaLivro =linhas.get(i);
			String[] linhaSplit = linhaLivro.split(";");
			
			String nome = linhaSplit[0];
			String autor = linhaSplit[1];
			Double preco = Double.parseDouble(linhaSplit[2]);
			String tipoPromocao = linhaSplit[3];
			Promocao promocao = new Promocao();
			
			for (Promocao objetoPromocao : listaPromocao) {
				
				if (objetoPromocao.getTipoPromocao().equals(tipoPromocao)) {
					promocao = objetoPromocao;
					break;
				}	
			}
			
			Livro livro = new Livro(nome, autor, preco, promocao);
			
			listaLivros.add(livro);
			
			}
	}
	
	public static void lerArquivoPromocao() throws IOException {
		Path arquivo = Paths.get("detalhes_promocao.csv");
		List <String> linhas = Files.readAllLines(arquivo);
		
		for (int i =1; i < linhas.size(); i++ ) {
			String linhaPromocao = linhas.get(i);
			String[] linhaSplit = linhaPromocao.split(";");
			
			String tipoPromocao = linhaSplit[0];	
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dataInicio = LocalDate.parse(linhaSplit[1], formatter);
			LocalDate dataFim = LocalDate.parse(linhaSplit[2], formatter);
			Double pctDesconto = Double.parseDouble(linhaSplit[3]);
			
			Promocao promocao = new Promocao(tipoPromocao, dataInicio, dataFim, pctDesconto);
			
			listaPromocao.add(promocao);
		}
	}
}
