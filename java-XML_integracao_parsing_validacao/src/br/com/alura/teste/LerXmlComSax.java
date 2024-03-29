package br.com.alura.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import br.com.alura.Handlers.ProdutorHandler;

public class LerXmlComSax {

	public static void main(String[] args) throws Exception {
	    XMLReader leitor = XMLReaderFactory.createXMLReader();
	    ProdutorHandler logica = new ProdutorHandler();
	    leitor.setContentHandler(logica);
	    InputStream ips = new FileInputStream("src/vendas.xml");
	    InputSource is = new InputSource(ips);
	    leitor.parse(is);

	    System.out.println(logica.getProdutos());
	}
	
	
}
