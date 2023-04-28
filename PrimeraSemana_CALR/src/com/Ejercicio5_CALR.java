package com;

import java.util.Scanner;

public class Ejercicio5_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int nota;
		int edad;
		String sexo;

		// Solicitud de datos al usuario
		System.out.println(
				"Este programa nos calcula la aceptación de una solicitud" + " en base a los siguientes parámetros:");
		System.out.print("Edad: ");
		edad = escaner.nextInt();
		System.out.print("Nota: ");
		nota = escaner.nextInt();
		escaner.nextLine();
		System.out.print("Sexo (M o F): ");
		sexo = escaner.nextLine();

		// Realizamos Cálculos y mostramos en pantalla
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("El valor de sexo introducido es incorrecto.\n" + "por favor, reenvíe el formulario.");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("POSIBLE");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
		}

	}

}
