package com;

public class Arrays2_JCGM {

	public static void main(String[] args) {
		
//		Crea un array de números de 100 posiciones, que contendrá los números del
//		1 al 100. Obtén la suma de todos ellos y la media.
		
		int numeros [] = new int [101];
		double suma = 0;
		double media =0.0;
		for(int i = 1; i <= 100; i++) {
			numeros[i] = numeros[i] + i;
			suma = suma + numeros [i];
			
			System.out.println(numeros[i]);
		}
		media = suma / 100;
		System.out.println("La suma de todos los valores es: "+suma);
		System.out.println("La media de todos los valores es: "+media);

	}

}
