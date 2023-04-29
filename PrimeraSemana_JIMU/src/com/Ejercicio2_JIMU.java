package com;

import java.util.Scanner;

public class Ejercicio2_JIMU {

	public static void main(String[] args) {
		/*
		 * .Realiza un programa que pida un número por 
		 * teclado y nos indique si es par o impar.

		 */
		int numero;
		int resultado;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un número por teclado");
		numero = entrada.nextInt();
		
		
		resultado= numero%2;
		
		if (resultado == 0) {
			System.out.println("El número es par");
			
		}else {
			System.out.println("El número es impar");

		}

	}

}
