package com;

import java.util.Scanner;

public class Arrays1_ACS {

	public static void main(String[] args) {
		
		//crea un array de 10 posiciones de números con valores 
		//pedidos por teclado. Muestra por consola el índice y 
		//el valor al que corresponde
		

		int[] numeros = new int [10];		
	
		for(int i=0; i<numeros.length;i++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un numero: ");
			numeros[i]=sc.nextInt();
		}
		
		for(int i=0; i<numeros.length;i++) {
			System.out.println("Indice: "+i+numeros[i]);
		}
		
		
	}

}
