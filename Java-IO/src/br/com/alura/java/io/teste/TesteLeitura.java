package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		// fluxo binarios Stream é para binarios 
		
		// fluxo binarios reader é para para caracteres 

		
		//fluxo de entrada de Arquivo java io
		InputStream file = new FileInputStream("lorem.txt"); ;// binario
		Reader isr = new InputStreamReader(file); // transforma bits em caracteres 
		BufferedReader br = new BufferedReader(isr); // junta varios cracteres em uma linha 		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		while (linha != null) {
			System.out.println(linha);
			 linha = br.readLine();
		}  
	
		
		br.close();
	}
}
