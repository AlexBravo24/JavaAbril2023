package com;

import java.util.Scanner;

public class Arrays1_AHP {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
Muestra por consola el índice y el valor al que corresponde.
		 */
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10] ;
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese un número: ");
			numeros [i] = input.nextInt();
		}
		for (int j = 0; j < numeros.length; j++) {
			System.out.println( j + ": " + numeros [j]);
		}
		
		input.close();
		
		
		
	}

}
