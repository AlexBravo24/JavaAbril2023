package com;

import java.util.Scanner;

public class Arrays3_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		System.out.println("Ingresa la frase: ");
		String frase;
		int letras;
		frase= lector.nextLine();
		frase=frase.toLowerCase();
		lector.close();
		char[] palabra;
		palabra= frase.toCharArray();
		letras=palabra.length;
		for (int i=0; i<letras; i++) {
			System.out.println(palabra[i]);
		}
			
	
		
		

	}

}
