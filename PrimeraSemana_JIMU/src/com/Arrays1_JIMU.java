package com;

import java.util.Scanner;

public class Arrays1_JIMU {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de números 
		 * con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.

		 */
		int numeros [] = new int [10];
				
				
		Scanner entrada = new Scanner (System.in);
		
		for (int i=0; i<10;i++) {
		System.out.println("Introduce el valor " +(i+1) + " del arreglo");
			numeros[i] = entrada.nextInt();
			
	}
		for (int i=0; i<10;i++) {
		System.out.println("El valor en " +(i+1) +" es: " +numeros[i]);	
		}
}
}
