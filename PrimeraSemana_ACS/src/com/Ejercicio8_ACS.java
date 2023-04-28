package com;

import java.util.Scanner;

public class Ejercicio8_ACS {

	public static void main(String[] args) {
		
		//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
		//seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
		//obtenido
		
		Scanner scanner = new Scanner(System.in);

		int dado;

		System.out.println("Resultado de la cara del dado es");
		dado = scanner.nextInt();

		switch (dado) {
		case 1:
			System.out.println("La cara opuesta del dado es \"seis\".");
			break;

		case 2:
			System.out.println("La cara opuesta del dado es cinco");
			break;

		case 3:
			System.out.println("La cara opuesta del dado es cuatro");
			break;

		case 4:
			System.out.println("La cara opuesta del dado es tres");
			break;

		case 5:
			System.out.println("La cara opuesta del dado es dos");
			break;

		case 6:
			System.out.println("La cara opuesta del dado es uno");
			break;

		default:
			System.out.println("Error, numero incorrecto");
		}

	}
}