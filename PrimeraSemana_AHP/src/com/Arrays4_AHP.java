package com;

public class Arrays4_AHP {

	public static void main(String[] args) {
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
los valores invertidos, es decir, que el segundo array deberá tener los valores 
{5,4,3,2,1}.
		 */
		int[] original = {1, 2, 3, 4, 5};
		int[] invertido = new int[original.length];

		for (int i = 0; i < original.length; i++) {
		  invertido [i] = original [original.length - 1 - i];	  
	}
		System.out.println("El array original es: ");
		for (int i = 0; i < original.length; i++) {
			System.out.println(original[i]);
		}
		System.out.println("El array invertido es: ");
		for (int i = 0 ; i < invertido.length ; i++ ) {
			System.out.println(invertido [i]);
		}
	}
}
