package com;

import java.util.Scanner;

public class Ejercicio10_JIMU {

	public static void main(String[] args) {
		/*10.Realiza un programa que pida un n�mero 
		 * entero entre uno y doce e imprima el 
		 * n�mero de d�as que tiene el 
             mes correspondiente.
		 * 
		 */
		int diaNumero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escriba el n�mero de mes correspondiente");
		diaNumero = entrada.nextInt();
		switch (diaNumero) {
		case 1: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 2: 
			System.out.println("El mes tiene 28 d�as");
			break;
		case 3: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 4: 
			System.out.println("El mes tiene 30 d�as");
			break;
		case 5: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 6: 
			System.out.println("El mes tiene 30 d�as");
			break;
		case 7: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 8: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 9: 
			System.out.println("El mes tiene 30 d�as");
			break;
		case 10: 
			System.out.println("El mes tiene 31 d�as");
			break;
		case 11: 
			System.out.println("El mes tiene 30 d�as");
			break;
		case 12: 
			System.out.println("El mes tiene 31 d�as");
			break;
			default:
				System.out.println("Error de selecci�n");
		}
	}

}
