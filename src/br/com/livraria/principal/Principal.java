package br.com.livraria.principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.livraria.models.Livro;
import br.com.livraria.models.Relatorio;
import br.com.livraria.utils.EscreverArquivo;
import br.com.livraria.utils.LerArquivo;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		LerArquivo.lerArquivoPromocao();
		LerArquivo.lerArquivoLivro();
		
		
		List <Livro> listaLivros = LerArquivo.listaLivros;
		
		List <Relatorio> listaRelatorio = new ArrayList<Relatorio>();
		
		
		
		for (Livro objetoLivro : listaLivros) {
			
		Relatorio relatorio = new Relatorio(objetoLivro.getNome(), objetoLivro.getAutor(), objetoLivro.getPreco(),
				retornaValorPromocional(objetoLivro.getPreco(), objetoLivro.getTipoPromocao().getPctDesconto()),
				objetoLivro.getTipoPromocao().getPctDesconto(), objetoLivro.getTipoPromocao().getDataInicio(),
				objetoLivro.getTipoPromocao().getDataFim());
		
		listaRelatorio.add(relatorio);
		}
		
		for (Relatorio relatorio : listaRelatorio) {
			System.out.println(relatorio.toString());
			
		}
		
		EscreverArquivo.escreverArquivo(listaRelatorio);
	}
	
	private static Double retornaValorPromocional(Double precoOriginal, Double pctDesconto) {
		return precoOriginal - (precoOriginal * (pctDesconto/100));
	}
}
