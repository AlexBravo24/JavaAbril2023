package com;

public class Arrays2_AHP {

	public static void main(String[] args) {
		/*
		 * Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
1 al 100. Obt�n la suma de todos ellos y la media.
		 */

		int[] numeros = new int[100] ;
		
		for (int j = 0; j < numeros.length; j++) {
			numeros [j] = j + 1 ;  
		}	
		int sum = 0;
		for (int i = 0; i  < numeros.length ; i++) {
		sum += numeros [i];
		
		}
		double media = (double) sum/ numeros.length;
		
		
	
		System.out.println("La suma de los n�meros del 1 al 100 es: " + sum);
        System.out.println("La media de los n�meros del 1 al 100 es: " + media);

}
}