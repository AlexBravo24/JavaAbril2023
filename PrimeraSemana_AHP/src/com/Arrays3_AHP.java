package com;

import java.util.Scanner;

public class Arrays3_AHP {

	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
caracteres.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase = input.nextLine() ;
		
		char [] carac = frase.toCharArray() ;
		
		System.out.println("Los caracteres de la frase son: ");
		for (int i = 0; i < carac.length; i++) {
			System.out.println(carac[i]);
			input.close();
		}
	}

}
