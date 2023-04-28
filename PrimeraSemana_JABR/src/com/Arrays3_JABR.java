package com;

import java.util.Scanner;

public class Arrays3_JABR {

	public static void main(String[] args) {
		
		/*3. Pide al usuario por teclado una frase 
		 * y pasa sus caracteres a un array de caracteres.
		 * 
		 */
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce una frase");
		
		String frase = input.next();
		
		char[] letras = new char[frase.length()];
		
				
		for (int i = 0; i < frase.length(); i++) {
			letras[i]=frase.charAt(i);
			System.out.println(letras[i]);
		}

	}

}
