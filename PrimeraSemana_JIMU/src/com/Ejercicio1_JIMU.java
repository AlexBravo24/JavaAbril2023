package com;

import java.util.Scanner;

public class Ejercicio1_JIMU {

	public static void main(String[] args) {
		
		/*1.Realiza un programa que reciba dos n�meros por 
		 * teclado e indique cu�l es mayor o si son iguales
		 */
		double numeroUno;
		double numeroDos;
		double resta;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un primer n�mero por teclado");
		numeroUno = entrada.nextInt();
		
		System.out.println("Introduce un segundo n�mero por teclado");
		numeroDos = entrada.nextInt();
		
		resta= numeroUno - numeroDos;
		
		if (resta > 0) {
			System.out.println("numeroUno es mayor");
			
		}else {
			System.out.println("numeroDos es mayor");

		}

	}

}
