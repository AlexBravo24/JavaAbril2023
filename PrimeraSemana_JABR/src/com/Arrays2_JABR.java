package com;

public class Arrays2_JABR {

	public static void main(String[] args) {
		
		/*
		 * 2. Crea un array de números de 100 posiciones, 
		 * que contendrá los números del 1 al 100. 
		 * Obtén la suma de todos ellos y la media.
		 */
	int[] numeros= new int[100];
	
	int suma = 0;
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = i+1;
		suma+=numeros[i];
	}
	System.out.println("La suma de los números del 1 al 10 es " + suma);
	System.out.println("La media de los números es " + suma/numeros.length);
 
	

	}

}
