package com;

import java.util.Scanner;

public class Ejercicio4_ACS {

	public static void main(String[] args) {

		// Realiza un programa que lea una cadena por teclado
		// y compruebe si es una letra mayúscula.

		String original;
		String cadena;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la cadena");
		original = entrada.next();
		cadena = original.toLowerCase();
		
		if(original.equals(cadena)) {
			System.out.println("El texto esta en minusculas");
		}else {
			System.out.println("El texto contiene mayusculas");
		}
		
		//////////////////////////////////////////////////
//		Scanner scanner = new Scanner(System.in);
//		String cadena;
//
//		System.out.print("Introduce la cadena: ");
//		cadena = scanner.nextLine();
//
//		if (cadena.length() != 1) {
//			System.out.println("La cadena no es una letra mayúscula");
//
//		} else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <= 0)) {
//			System.out.println("La cadena es una letra mayúscula.");
//		} else {
//			System.out.println("La cadena no es una letra mayúscula.");
//
//		}

	}

}
