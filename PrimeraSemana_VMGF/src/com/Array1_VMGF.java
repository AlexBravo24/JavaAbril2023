package com;

import java.util.Scanner;

public class Array1_VMGF {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos
		//por teclado. Muestra por consola el índice y el valor al 
		//que corresponde.

		int[] arreglo= new int [10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese los 10 valores");
		for (int i=0; i< arreglo.length; i++) {
			arreglo[i] = sc.nextInt();
			}
		System.out.println("los numeros ingresados son:");
		for (int i=0; i< arreglo.length; i++) {
			System.out.println(arreglo[i]+ ":");
			}
	

}
}

