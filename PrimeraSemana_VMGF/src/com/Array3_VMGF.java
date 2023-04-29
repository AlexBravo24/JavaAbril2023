package com;

public class Array3_VMGF {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase 
		//y pasa sus caracteres a un array de caracteres.
		
		
		int[] numeros = new int[100];
		
		int suma =0;
		double media;
		
		for (int i=0; i<numeros.length; i++) {
			numeros[i] = i + 1;
			suma += numeros[i];
			}
			System.out.println("la suma es:" + suma);
			media = (double) suma / numeros.length;
			System.out.println("la media es" + media);

		

	}

}
