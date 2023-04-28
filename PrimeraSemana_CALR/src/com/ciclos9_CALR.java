package com;

import java.util.Scanner;

public class ciclos9_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int a, b;

		// Lectura de dos números enteros A Y B
		// A debe ser menor que B
		do {
			System.out.print("Introduce un número entero: ");
			a = escaner.nextInt();
			System.out.print("Introduce otro número entero mayor que el anterior: ");
			b = escaner.nextInt();
			if (a >= b) {
				System.out.println("El segundo número debe ser mayor que el primero");
			}
		} while (a >= b);

		// Mostrar los números pares entre A y B.
		System.out.println("\nNúmeros pares desde " + a + " hasta " + b + " : ");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
