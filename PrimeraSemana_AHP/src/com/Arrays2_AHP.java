package com;

public class Arrays2_AHP {

	public static void main(String[] args) {
		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del 
1 al 100. Obtén la suma de todos ellos y la media.
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
		
		
	
		System.out.println("La suma de los números del 1 al 100 es: " + sum);
        System.out.println("La media de los números del 1 al 100 es: " + media);

}
}