package com;

import java.util.Scanner;

public class Arrays1_JABR {

	public static void main(String[] args) {
	
		/*1. Crea un array de 10 posiciones de números 
		 * con valores pedidos por teclado.
		 *  Muestra por consola el índice y el valor al que corresponde.
		 * 
		 */
		
		int [] numeros = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número a almacenar en la posición " + i);
			numeros[i]=input.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("En la posición " + i + " Se encuentra el valor " + 
		numeros[i]);
			
		}

	}

}
