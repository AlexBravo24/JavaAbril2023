package com;

import java.util.Scanner;

public class Arrays1_JABR {

	public static void main(String[] args) {
	
		/*1. Crea un array de 10 posiciones de n�meros 
		 * con valores pedidos por teclado.
		 *  Muestra por consola el �ndice y el valor al que corresponde.
		 * 
		 */
		
		int [] numeros = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el n�mero a almacenar en la posici�n " + i);
			numeros[i]=input.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("En la posici�n " + i + " Se encuentra el valor " + 
		numeros[i]);
			
		}

	}

}
