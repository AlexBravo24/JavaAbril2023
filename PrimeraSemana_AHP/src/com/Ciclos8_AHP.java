package com;

import java.util.Scanner;

public class Ciclos8_AHP {

	public static void main(String[] args) {
		/*8.Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
mayor
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero: ");
		int primero = input.nextInt();
		
		System.out.println("Introduce otro n�meor entero: ");
		int segundo = input.nextInt();
		
		input.close();
		
		if (primero > segundo) {
			System.out.println("El n�mero m�s bajo es: " + segundo);
			System.out.println("El n�mero m�s grande es: " + primero);
		}else if (primero < segundo) {
			System.out.println("El n�mero m�s bajo es: " + primero);
			System.out.println("El n�mero m�s grande es: "+segundo);
		} else if (primero == segundo) {
			System.out.println("Ambos n�meros son iguales");
		} else {
			System.out.println("Error!, favor de digitar de nuevo");
		}
		
		
		
		
	}

}
