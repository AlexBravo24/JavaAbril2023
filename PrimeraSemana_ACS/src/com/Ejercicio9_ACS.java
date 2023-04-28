package com;

import java.util.Scanner;

public class Ejercicio9_ACS {

	public static void main(String[] args) {

		// ealiza un programa que pida el día de la semana
		// (del 1 al 7) y escriba el día correspondiente. Si
		// introducimos otro número nos da un error

		Scanner scanner = new Scanner(System.in);

		int x;
		System.out.println("ingrese el numero de dias:");
		x = scanner.nextInt();
		if (x == 1) {
			System.out.println("lunes");
		}

		if (x == 2) {
			System.out.println("martes");
		}

		if (x == 3) {
			System.out.println("miercoles");
		}

		if (x == 4) {
			System.out.println("jueves");
		}

		if (x == 5) {
			System.out.println("viernes");
		}

		if (x == 6) {
			System.out.println("sabado");
		}

		if (x == 7) {
			System.out.println("domingo");
		} else {
			System.out.println("Error, numero incorrecto");
		}

	}

}
