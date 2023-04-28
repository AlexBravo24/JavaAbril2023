package com;

import java.util.Scanner;

public class Ejercicio4_DCC {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		String cadena1;
		String cadena2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un nombre");
		cadena1 = lector.next();
		
		cadena2 = cadena1.toLowerCase();
		
		if(cadena1 == cadena2) {
			System.out.println("Las cadenas no contiene mayusculas");
		} else {
			System.out.println("La cadena contiene mayusculas");
		}

	}

}
