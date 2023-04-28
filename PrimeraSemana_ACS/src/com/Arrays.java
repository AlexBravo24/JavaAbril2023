package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los arrays o arreglos, son una estructura de datos que almcenan un tipo de
		 * datos en com�n. Como caracteristicas se necesita declara su tamaa�o o
		 * longitud, y una vez declarado este no puede crecer o cambiar su tiempo de
		 * ejecuci�n
		 */

		// Declarar un array y tambi�n su tama�o

		// int numero = 122123;

		int[] numeros = new int[5]; // un array de numeros enteros
		// con su tama�o declarado
		char[] letras = new char[5]; // un array de caracteres

		// En los arrays podemos almacenar datos en cada una
		// de las posiciones en las cuenta

		numeros[0] = 100;
		numeros[1] = 101;
		numeros[2] = 102;
		numeros[3] = 103;
		numeros[4] = 104;
		//numeros[5] = 105;
		
		//Presentar en consola o darle salida al valor contenido
		//en determinada posici�n del array.		
		System.out.println(numeros[3]);
		
		//Otra manera de declarar el array e iniciarlo ya con sus  valores
		
		String [] nombres = {"Ivan","Carlos","Yocelin","Adrian"};
		
		System.out.println(nombres[2]);
		
		//imprimir en pantalla los valores del array
		for(int i=0; i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		
		for(int i=0; i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
		
		letras[0]='A';
		letras[1]='l';
		letras[2]='e';
		letras[3]='x';
		letras[4]='a';
		
//		for(int i=0;i<letras.length;i++) {
//			System.out.println(letras[i]);
//		}
		
		//For each.Imprimir cada uno d los elementos del array
		for(char i:letras) {
			System.out.print(i);
		}
		
	}

}
