package com;

import java.util.Scanner;

public class Ciclos4_AHP {

	public static void main(String[] args) {
		/*
		 * 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como
		 * resultado cuántas veces existe esa letra dentro de la frase. Si no existe,
		 * imprimir un mensaje “Carácter no encontrado”.
		 */
		String cadena;
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		cadena = input.nextLine();

		String letra;
		System.out.println("Escribe una letra que desees contar: ");
		letra = input.nextLine().toLowerCase();

		input.close();

		if (cadena.toLowerCase().contains(letra)) {
			int contador = 0;
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.toLowerCase().charAt(i) == letra.charAt(0)) {
					contador++;
				}
			}
			System.out.println("La letra \"" + letra + "\" se repite: " + contador);
		} else {
			System.out.println("Caracter \"" + letra + "\" NO encontrado");

		}

	}
}
