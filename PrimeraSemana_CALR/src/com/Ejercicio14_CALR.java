package com;

import java.util.Scanner;

public class Ejercicio14_CALR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int horasTrabajadas, total, horasExtra;

		// ingreso de datos por el usuario
		System.out.println("Ingrese el número de horas trabajadas");
		horasTrabajadas = consola.nextInt();

		// proceso de condición
		if (horasTrabajadas <= 40) {
			total = horasTrabajadas * 16;

			// operaciones y muestra de resultado en pantalla
			System.out.println("Su sueldo es de $:" + total);
		} else {
			horasExtra = horasTrabajadas - 40;
			total = (horasExtra * 20) + (40 * 16);
			System.out.println("Su sueldo es de $:" + total);
		}

	}

}
