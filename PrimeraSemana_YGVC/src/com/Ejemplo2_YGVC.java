package com;

import java.util.Scanner;

public class Ejemplo2_YGVC {

	public static void main(String[] args) {
	/*Realiza un programa que pida un número por teclado
	 *  y nos indique si es par o impar.
	 * 
	 */
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.print("Por favor ingrese el número a evaluar :");
		n = teclado.nextInt ();
		
		if(n % 2 ==0) {
			System.out.println(n+" es un numero par");
		}else {
			System.out.println(n+" no es un numero par.");
		}

	}

}
