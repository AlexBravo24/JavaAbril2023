package com;

import java.util.Scanner;

public class Ejercicio1_JIMU {

	public static void main(String[] args) {
		
		/*1.Realiza un programa que reciba dos números por 
		 * teclado e indique cuál es mayor o si son iguales
		 */
		double numeroUno;
		double numeroDos;
		double resta;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un primer número por teclado");
		numeroUno = entrada.nextInt();
		
		System.out.println("Introduce un segundo número por teclado");
		numeroDos = entrada.nextInt();
		
		resta= numeroUno - numeroDos;
		
		if (resta > 0) {
			System.out.println("numeroUno es mayor");
			
		}else {
			System.out.println("numeroDos es mayor");

		}

	}

}
