package br.com.livraria.utils;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVWriter;

import java.text.DecimalFormat;

import br.com.livraria.models.Relatorio;

public class EscreverArquivo {
	
	 

	public static void escreverArquivo (List <Relatorio> listaRelatorio) throws IOException {
		
		Writer writer = Files.newBufferedWriter(Paths.get("Relatorio.csv"));
		CSVWriter csvWriter = new CSVWriter (writer, ';', CSVWriter.NO_QUOTE_CHARACTER,
               CSVWriter.DEFAULT_ESCAPE_CHARACTER,
               CSVWriter.DEFAULT_LINE_END);
	    	
	    DecimalFormat df = new DecimalFormat("0.00");
	    
	    String[] cabecalho = {"Nome", "Autor", "Preco Original", "Preco Promocional", "Porcentagem Aplicada",
	    		"Data Inicio", "Data Fim"};
	    csvWriter.writeNext(cabecalho);
	        
		for (Relatorio objetoRelatorio : listaRelatorio) {
			
			String[] linhas = { objetoRelatorio.getNomeLivro(), objetoRelatorio.getAutor(), 
					df.format(objetoRelatorio.getPrecoOriginal()), df.format(objetoRelatorio.getPrecoPromocional()), 
					df.format(objetoRelatorio.getPorcentagemAplicada()), objetoRelatorio.getDataInicio().toString(), 
					objetoRelatorio.getDataFim().toString() 
					};
			
	        csvWriter.writeNext(linhas);
	       
		}
		
		 
		 csvWriter.flush();
		 csvWriter.close();
	     writer.close();
		
		
		
		
		
	}

}
