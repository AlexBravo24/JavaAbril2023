package com;

public class Arrays2_ACS {

	public static void main(String[] args) {
		
		
		//Crea un array de n�meros de 100 posiciones, que contendr� 
		//los n�meros del 1 al 100. Obt�n la suma de todos ellos y 
		//la media.

//		int suma = 0;
//		int i = 0;
//		while (i <=100) {
//			suma = suma+ i;
//			i = i +1;
//		}
		
//		for (int i = 0; i <=100; i++) {
//			System.out.println(suma + " + " +i);
//			suma = suma +i;
//		}
		
	//	System.out.println("suma de los 100 primeros numeros es: " + suma);
		
		int [] numeros = new int [100];
		
		int suma = 0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i +1;
			suma += numeros[i];
		}
		
		System.out.println("La suma es: " + suma);
		
		media = (double) suma / numeros.length;
		
		System.out.println("La media es " + media);
		
	}

}
