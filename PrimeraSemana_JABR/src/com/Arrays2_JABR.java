package com;

public class Arrays2_JABR {

	public static void main(String[] args) {
		
		/*
		 * 2. Crea un array de n�meros de 100 posiciones, 
		 * que contendr� los n�meros del 1 al 100. 
		 * Obt�n la suma de todos ellos y la media.
		 */
	int[] numeros= new int[100];
	
	int suma = 0;
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = i+1;
		suma+=numeros[i];
	}
	System.out.println("La suma de los n�meros del 1 al 10 es " + suma);
	System.out.println("La media de los n�meros es " + suma/numeros.length);
 
	

	}

}
