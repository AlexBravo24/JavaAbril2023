package com;

import java.util.Scanner;

public class Ciclos10_AHP {

	public static void main(String[] args) {
		/* 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		 * 
		 */

		Scanner input = new Scanner(System.in);

		int num ; 
		int positivos = 0 ;
		int impares = 0;
	
		for (int i = 1; i <= 20; i++) {
			System.out.println("Ingrese el \"" +i+ "\" número: ");
			
				
			 num = input.nextInt();
		
		if (num > 0) {
			System.out.println("El número \"" +num+ "\" es positivo" );
			positivos += num;
	
		}else if (num <0) {
			System.out.println("El número \"" +num+ "\" es negativo" );
		}else {
			System.out.println("el número es 0");
		}
		
		
		if (num % 2 == 0) {
			System.out.println("El número \"" +num+ "\" es par" );
		}else if (num % 2 != 0) {
			System.out.println("El número \"" +num+ "\" es impar");
			impares += num; 
		} else {
			System.out.println("Error!, favor de digitar de nuevo");
		}
		
	}
		System.out.println("La sumatoria de los números positivos es: "+positivos);
		System.out.println("La sumatoria de los números impares es: "+impares);
		input.close();
	}
}


