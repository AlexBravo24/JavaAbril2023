package com;

public class Array {

	public static void main(String[] args) {
		/*
		 * Los arrays o arreglos, son una estructura de datos (colección de datos) que
		 * almacenan un tipo de datos en común. como careacterística se necesita
		 * declarar su tamaño o longitud, y una vez declarado, este no puede crecer o
		 * cambiar en tiempo de ejecución
		 *
		 */

		// Declarar un array y su tamaño

		int[] numeros = new int[5]; // 5 = cantidad de datos a alamacenra
		char[] letras = new char[5]; // Un array de caracteres de tamaño 5

		// En los arrays podemos almacenar datos en cada una de las
		// posiciones con las que cuenta.

		numeros[0] = 100; // Recordar que el array inicia en 0
		numeros[1] = 101;
		numeros[2] = 102;
		numeros[3] = 103;
		numeros[4] = 104;

		// Presentar en consola o darle salida al calor contenido
		// en determinada posición del array
		System.out.println(numeros[3]);

		// Otra manera de declarar el array e iniciarlo

		String[] nombres = { "Adrian", "Carlos", "Ivan", "Yocelin" };

		System.out.println(nombres[0]);

		// Imprimir en pantalla los valores del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int j = 0; j < nombres.length; j++) {
			System.out.println(nombres[j]);
		}

		letras[0] = 'A';
		letras[1] = 'l';
		letras[2] = 'e';
		letras[3] = 'x';
		letras[4] = 'i';

		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]); // todo junto
		}
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]); // Separa por líenas
		}

		// For each. Imprimir cada uno de los elementos de array
		for (char i : letras) {
			System.out.print(i);
		}

		
		
		
		
	}
}
