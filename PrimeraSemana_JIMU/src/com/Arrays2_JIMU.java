package com;

import java.util.Scanner;

public class Arrays2_JIMU {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de n�meros de 100 posiciones, 
		 * que contendr� los n�meros del 
			1 al 100. Obt�n la suma de todos ellos y la media.

		 */

		int numeros [] = new int [100];
		int suma=0;
		int media;
		
		Scanner entrada = new Scanner (System.in);
		for (int i=0; i<100;i++) {
			numeros[i] = (i+1);
			suma=suma+numeros[i];
	}
		media=suma/100;
		
		System.out.println("El valor de la suma es " +suma);
		
		System.out.println("El valor de la media es " +media);

		

}
}