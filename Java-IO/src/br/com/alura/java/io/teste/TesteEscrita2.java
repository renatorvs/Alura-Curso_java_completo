package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		// fluxo binarios Stream È para binarios 
		
		// fluxo binarios reader È para para caracteres 

		
		//fluxo de entrada de Arquivo java io
//		OutputStream fos = new FileOutputStream("lorem2.txt"); ;// binario
//		Writer osw = new OutputStreamWriter(fos); // transforma bits em caracteres 
//		BufferedWriter bw = new BufferedWriter(osw); // junta varios cracteres em uma linha 		
//	
		

        //Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//       Writer osw = new OutputStreamWriter(fos);
//       Buff3eredWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));

                bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdﬂ");

        bw.close();
	}
}
