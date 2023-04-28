package com;

import java.util.Scanner;

public class Ejercicio14_AHP {

	public static void main(String[] args) {
		/*
		 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		 * trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
		 * y $20 por cada hora extra
		 * 
		 */

		int horas;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce las horas trabajadas: ");
		horas = input.nextInt();

		input.close();
		if (horas <= 40) {
			int x = 16;
			int salario = horas * x;
			System.out.println("El salario es: " + salario);

		} else if (horas > 40) {
			int extra = (horas - 40) * (20);
			int fin = (extra + 640);
			System.out.println("El salario es: " + fin);
		} else {
			System.out.println("Error! digite de nuevo un monto");
		}

	}
}
