package com;

public class Array {

	public static void main(String[] args) {
		/* Los arrayso arreglos, son una estructura de datosque almacenan un tipo de datos en comun.
		 * Como caracteristca, se necesita declarar su tamaño o longitud, y una vez declarado este no puede
		 * crecer o cambiar en tiempo de ejecucion */
		
		int [] numeros = new int [5]; //array de numeros enteros
		
		char[] letras = new char [5]; //array de caracteres
		
		numeros[0] = 100;
		numeros[1] = 101;
		numeros[2] = 102;
		numeros[3] = 103;
		numeros[4] = 104;
		
		System.out.println(numeros[4]);
		
		//Otra forma de declarar el array ya con sus valores 
		
		String [] nombres = {"Diego","Brody","Jhony","Caguamas","Gody","leyo"};
		
		System.out.println(nombres[2]);
		
		System.out.println("---Impresion de nombres lista completa por metodo for---");
		
		for (int i=0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("---Impresion de numeros lista completa por metodo for---");
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("---Impresion de letras lista completa por metodo for---");
		
		letras[0] = 'A';
		letras[1] = 'B';
		letras[2] = 'x';
		letras[3] = '/';
		letras[4] = 'c';
		
		for (int i=0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		System.out.println("---Impresion de letras lista completa por metodo for each---");
		
		//For each
		for(char i: letras) {
			System.out.println(i);
		}

	}

}
