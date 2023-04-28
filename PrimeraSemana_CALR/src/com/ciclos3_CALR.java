package com;

public class ciclos3_CALR {

	public static void main(String[] args) {

		String frase = "salaS";
		frase = frase.toLowerCase();
		if (PalindromoFunc(frase)) {
			System.out.print("si, es un palindromo.");

		} else {
			System.out.print("No es un palindromo.");
		}
	}

	static boolean PalindromoFunc(String frase) {
		
		//declaracion de variables del metodo
		int i = 0, j = frase.length() - 1;
		
		//operaciones
		while (i < j) {

			// verifica si hay algun caracter desigual
			if (frase.charAt(i) != frase.charAt(j))
				return false;

			// actualiza los punteros
			i++;
			j--;
		}
		return true;
	}
}