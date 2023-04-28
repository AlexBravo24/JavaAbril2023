package com;

public class ArrayBidemensional {

	public static void main(String[] args) {
		/*
		 * Array Bidemensional - Estructura que contiene datos de un mismo tipo, pero,
		 * pasamos de tener 1 sola dimension a 2 ó más. Podríamos imáginarlo
		 * gráficamente que pasaríasmos a el concepto de una "tabla"
		 */

		// Declarando un array de dos dimensiones

		int[][] numeros = new int[3][3]; // Filas y Comlumnas

		numeros[0][0] = 1;
		numeros[0][1] = 0; // [0]. [1][2][3]
		numeros[0][2] = 0;

		numeros[1][0] = 0;
		numeros[1][1] = 1; // [1]. [4][5][6]
		numeros[1][2] = 0;

		numeros[2][0] = 0;
		numeros[2][1] = 0; // [2]. [7][8][9]
		numeros[2][2] = 1;

		// Podemos asignar valores al array bidemensional con la declaración de llaves

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]); // 123 luego 456 luego 789
			}
			
		}

	}

}
