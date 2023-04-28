package com;

public class Arrays {

	public static void main(String[] args) {
		/*Los Arrays
		 * */
		
		int [] numeros = new int [5]; //Array de numeros enteros
		//con tamaño declarado
		char [] caracter = new char[5];//Array de caracteres
		
		numeros[0] = 100;
		numeros[1] = 101;
		numeros[2] = 102;
		numeros[3] = 103;
		numeros[4] = 104;
		
		//impresion en pantalla del valor contenido en el indice indicado
//		System.out.println(numeros[4]);
		
		String [] nombres = { "Ivan", "Carlos", "Yocelin", "Adrian"};
	//	System.out.println(nombres[2]);
		
		//impresion en pantalla de los valores del Array nombres
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}

}
