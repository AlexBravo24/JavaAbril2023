package com;

import java.util.Scanner;

public class Ciclos4_ACS {

	public static void main(String[] args) {

		// Programa que reciba una frase y una letra por teclado.
		// Deberá retornar como resultado cuántas veces existe esa
		// letra dentro de la frase. Si no existe, imprimir un
		// mensaje “Carácter no encontrado”.

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa la frase");
		String frase = sc.nextLine(); // leyendo la frase

		System.out.println("Ingresa la letra");
		char letra = sc.nextLine().charAt(0); // leyendo la letra

		int count = 0;

		for (int i = 0; i < frase.length(); i++) {
			char capt = frase.charAt(i);

			if (letra == capt) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("La letra se repite " + count + " veces");
		} else {
			System.out.println("Error La letra no se encuentra en la frase");
		}
	}
}
