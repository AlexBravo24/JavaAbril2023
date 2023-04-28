package com;

import java.util.Scanner;

public class Ejercicio1_DCC {

	public static void main(String[] args) {
		/*---Realiza un programa que reciba dos 
		 * numeros por teclado e indique cual es 
		 * mayor o si son iguales ---- */
		int valor1;
		int valor2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero");
		valor1 = lector.nextInt();
		
		System.out.println("Introduce un segundo numero");
		valor2 = lector.nextInt();
		
		if(valor1== valor2) {
			System.out.println("Los numeros son iguales");
		} else if(valor1 > valor2) {
			System.out.println("El Valor 1 es mayor");
		} else {
			System.out.println("El Valor 2 es mayor");
		}
	}

}
