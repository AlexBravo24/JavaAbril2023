package com;

import java.util.Scanner;

public class Ciclos9_AHP {

	public static void main(String[] args) {
		/*9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		 * 
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero: ");
		int primero = input.nextInt();
		
		System.out.println("Introduce otro n�mero entero: ");
		int segundo = input.nextInt();
		
		input.close();
		
		if (primero % 2 == 0 && segundo % 2 != 0) {
			System.out.println("El primer n�mero es par: " + primero);
			System.out.println("El segundo n�mero es impar: " + segundo);
		}else if (segundo % 2 == 0 && primero % 2 != 0) {
			System.out.println("El primer n�mero es impar: " + primero);
			System.out.println("El segundo n�mero es par "+segundo);
		} else if (primero % 2 == 0 && segundo % 2 == 0) {
			System.out.println("Ambos n�meros son par");
		} else {
			System.out.println("Error!, favor de digitar de nuevo");
		}
		
		
		
		
	}

}