package com;

import java.util.Scanner;

public class Ejercicio2_JIMU {

	public static void main(String[] args) {
		/*
		 * .Realiza un programa que pida un n�mero por 
		 * teclado y nos indique si es par o impar.

		 */
		int numero;
		int resultado;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n�mero por teclado");
		numero = entrada.nextInt();
		
		
		resultado= numero%2;
		
		if (resultado == 0) {
			System.out.println("El n�mero es par");
			
		}else {
			System.out.println("El n�mero es impar");

		}

	}

}
