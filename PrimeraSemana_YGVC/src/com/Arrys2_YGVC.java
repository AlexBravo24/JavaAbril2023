package com;

public class Arrys2_YGVC {

	public static void main(String[] args) {
		/*Crea un array de números de 100 posiciones, 
		 * que contendrá los números del 1 al 100. 
		 * Obtén la suma de todos ellos y la media.
		 * 
		 */
		
		int[] numeros =new int[100];
		
		//DEclaro las variables necesarias
		int suma =0;
		double media;
		
		//Recorro el array, asigno números y sumo
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			suma += numeros[i];
			
		}
		
		//Calculo la media y muestra la suma y la media
		System.out.println("La suma es" + suma);
		
		media = (double) suma / numeros.length;
		
		System.out.println("La media es" + media);
		

	}

}
