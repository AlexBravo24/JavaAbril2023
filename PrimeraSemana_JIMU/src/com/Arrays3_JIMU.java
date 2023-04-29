package com;

import java.util.Scanner;

public class Arrays3_JIMU {

	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase 
		 * y pasa sus caracteres a un array de caracteres.
		 */
		String frase;
		char frases []= new char [100000]; //cómo declarar un arreglo indefinido
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe una frase");
		frase = entrada.nextLine();
		
		
		for (int i=0;i<frase.length();i++) {
		
		frases[i]= frase.charAt(i); 
		}
		
		System.out.print(frases);

	}

}
