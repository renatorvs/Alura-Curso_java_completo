package br.com.bitebank.banco.arrays.teste;

import java.awt.List;
import java.util.ArrayList;

public class AutoboxingTeste {


        //	PARSE = TRANSFORMAR UMA STRING EM OUTROS TIPOS PRIMITIVOS
        	
        	 public static void main(String[] args) {


                 int idade = 29;
                 Integer idadeRef = Integer.valueOf(29); //autoboxing
                 System.out.println(idadeRef.doubleValue());

                 System.out.println(Integer.MAX_VALUE);
                 System.out.println(Integer.MIN_VALUE);

                 System.out.println(Integer.SIZE);
                 System.out.println(Integer.BYTES);

                 int valor = idadeRef.intValue(); //unboxing
                 String s = args[0];//"10"
                 Integer numero = Integer.valueOf(s);
                 //int numero = Integer.parseInt(s);
                 System.out.println(numero);

                  ArrayList<Integer> numeros = new ArrayList<Integer>();
                 numeros.add(29); //Autoboxing


         }
        	

}

