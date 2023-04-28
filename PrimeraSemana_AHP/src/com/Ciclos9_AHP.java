package com;

import java.util.Scanner;

public class Ciclos9_AHP {

	public static void main(String[] args) {
		/*9. Programa Java que lea dos números y muestre los números pares entre ellos
		 * 
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int primero = input.nextInt();
		
		System.out.println("Introduce otro número entero: ");
		int segundo = input.nextInt();
		
		input.close();
		
		if (primero % 2 == 0 && segundo % 2 != 0) {
			System.out.println("El primer número es par: " + primero);
			System.out.println("El segundo número es impar: " + segundo);
		}else if (segundo % 2 == 0 && primero % 2 != 0) {
			System.out.println("El primer número es impar: " + primero);
			System.out.println("El segundo número es par "+segundo);
		} else if (primero % 2 == 0 && segundo % 2 == 0) {
			System.out.println("Ambos números son par");
		} else {
			System.out.println("Error!, favor de digitar de nuevo");
		}
		
		
		
		
	}

}