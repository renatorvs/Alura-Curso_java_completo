package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		// fluxo binarios Stream é para binarios 
		
		// fluxo binarios reader é para para caracteres 

		
		//fluxo de entrada de Arquivo java io
		OutputStream fos = new FileOutputStream("lorem2.txt"); ;// binario
		Writer osw = new OutputStreamWriter(fos); // transforma bits em caracteres 
		BufferedWriter bw = new BufferedWriter(osw); // junta varios cracteres em uma linha 		
	
		
	
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n" );
		
		bw.newLine();
		bw.newLine();
		bw.write("tempor incidniam,\r\n" );
		
		bw.close();
	}
}
