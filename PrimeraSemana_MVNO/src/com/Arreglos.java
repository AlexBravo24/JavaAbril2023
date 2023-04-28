package com;

public class Arreglos {
	public static void main(String[] args) {
		// que amanacena un tipo de datos 
		
		
		
		//declarar un array y tambien su tamaño
		//int numero= 11212121;
		int [] numeros = new int [5];
		char []letras = new char [5]; 
	//En los arrays podemos almacenar datos en cada una 
		//de las posiciones con las que cuenta
		
		numeros[0]=100;
		numeros[1]=101;
		numeros[2]=102;
		numeros[3]=103;
		numeros[4]=104;
		
		//presentar en consola o darle salida al valor contenido
		//en determinada posicion del array
		
		System.out.println(numeros[0]);
		
		String [] nombres = {"Ivan", "Carlos"};
		System.out.println(nombres[2]);
		
		//imprimir en pantalla los valores  del array
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}

}
