package com;

import java.util.Scanner;

public class Arrays1_CALR {

	public static void main(String[] args) {
		// declaracion de variables
		Scanner escaner = new Scanner(System.in);
		int[] vector = new int[10];
		int numeros;

		// operaciones e impresion de resultados

		for (int i = 0; i < vector.length; i++) {
			System.out.println("ingresa un numero");
			numeros = escaner.nextInt();
			vector[i] = numeros;
			System.out.println("posicion del indice: " + i);
			System.out.println("Valor contenido: " + vector[i]);
		}
	}

}
