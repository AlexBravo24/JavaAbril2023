package com;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Los arrays o arreglos, son una estructura de datos (Colección de datos) 
		 * que almacenan un tipo de datos en común
		 * como caracteristica se necesita declarar su tamaño
		 * o longitud y una vez declarado este no puede creccer o cambiar en tiempo de ejecución
		 * 
		 */
		
		int numeros [] = new int [5]; //array de números enteros con su tamaño declarado
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
