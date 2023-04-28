package com;

import java.util.Scanner;

public class Arrays3_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		// Pido al usuario que escriba una frase
		System.out.println("Escriba una frase");
		String frase = escaner.nextLine();

		// Creamos un array de caracteres
		char caracteres[] = new char[frase.length()];

		// Recorremos la frase y tomamos cada caracter y lo metemos en el array
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
			System.out.println(caracteres[i]);
		}

	}

}
