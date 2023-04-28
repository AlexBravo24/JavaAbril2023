package com;

import java.util.Scanner;

public class Ciclos8_AHP {

	public static void main(String[] args) {
		/*8.Programa Java que lea dos números y muestre los números desde el menor hasta el 
mayor
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int primero = input.nextInt();
		
		System.out.println("Introduce otro númeor entero: ");
		int segundo = input.nextInt();
		
		input.close();
		
		if (primero > segundo) {
			System.out.println("El número más bajo es: " + segundo);
			System.out.println("El número más grande es: " + primero);
		}else if (primero < segundo) {
			System.out.println("El número más bajo es: " + primero);
			System.out.println("El número más grande es: "+segundo);
		} else if (primero == segundo) {
			System.out.println("Ambos números son iguales");
		} else {
			System.out.println("Error!, favor de digitar de nuevo");
		}
		
		
		
		
	}

}
