package com;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Los arrays o arreglos, son una estructura de datos (Colecci�n de datos) 
		 * que almacenan un tipo de datos en com�n
		 * como caracteristica se necesita declarar su tama�o
		 * o longitud y una vez declarado este no puede creccer o cambiar en tiempo de ejecuci�n
		 * 
		 */
		
		int numeros [] = new int [5]; //array de n�meros enteros con su tama�o declarado
		char [] letras = new char [5]; //un array de caracteres
		
		numeros[0]=100;
		numeros[1]=101;
		numeros[2]=102;
		numeros[3]=103;
		numeros[4]=104;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
		
		
		
		
		
		

	}

}
