package com;

import java.util.Scanner;

public class ciclos8_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int numero1, numero2, menor, mayor;

		// Lectura de dos números enteros distintos
		do {
			System.out.print("Introduce un número entero: ");
			numero1 = escaner.nextInt();
			System.out.print("Introduce otro número entero distinto del anterior: ");
			numero2 = escaner.nextInt();
			if (numero1 == numero2) {
				System.out.println("Debes introducir dos números distintos");
			}
		} while (numero1 == numero2);

		// Calcular cuál de los números es el mayor y cuál el menor
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}

		// Mostrar por pantalla los números desde el menor hasta el mayor.
		System.out.println("\nNúmeros desde el " + menor + " hasta el " + mayor + " : ");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}

	}

}
