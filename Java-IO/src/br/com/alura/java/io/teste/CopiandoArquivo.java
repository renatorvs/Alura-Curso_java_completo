package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class CopiandoArquivo {
	public static void main(String[] args) throws IOException {
		// fluxo binarios Stream é para binarios 

		// fluxo binarios reader é para para caracteres 


		//fluxo de entrada de Arquivo java io
		
		//OutputStream s = new Socket().getOutputStream();
		
		

		        InputStream fis = System.in;
		        Reader isr = new InputStreamReader(fis);
		        BufferedReader br = new BufferedReader(isr);

		        OutputStream fos = new FileOutputStream("lorem2.txt");
		        Writer osw = new OutputStreamWriter(fos);
		        BufferedWriter bw = new BufferedWriter(osw);

		        String linha = br.readLine();

		        while (linha != null && !linha.isEmpty()) {
		            bw.write(linha);
		            bw.newLine();
		            linha = br.readLine();
		        }

		        br.close();
		        bw.close();
		    }

}

