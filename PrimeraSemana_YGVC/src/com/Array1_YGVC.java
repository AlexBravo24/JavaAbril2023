package com;

import java.util.Scanner;

public class Array1_YGVC {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de n�meros 
		 * con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que 
		 * corresponde.
		 * 
		 */
		//1 2 3 4 5 6 7 8 9 10
		
		//0 1 2 3 4 5 6 7 8 9
		int[] arreglo = new int [10];	
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese 10 n�meros enteros separados por espacio:");
	        for (int i = 0; i < arreglo.length; i++) {
	            arreglo[i] = sc.nextInt();
	        }

	        // Imprimir los n�meros en el arreglo
	        System.out.println("Los n�meros ingresados son:  ");
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i]+",");
	        }
	}

}
