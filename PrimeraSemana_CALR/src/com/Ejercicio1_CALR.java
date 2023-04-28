package com;

import java.util.Scanner;

public class Ejercicio1_CALR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Ingrese dos numeros");
		int valor1 = Integer.parseInt(consola.nextLine());
		int valor2 = Integer.parseInt(consola.nextLine());

		if (valor1 < valor2) {
			System.out.println("El numero mayor es valor2 " + valor2);
		} else if (valor1 > valor2) {
			System.out.println("el numero mayor es valor1 " + valor1);
		} else if (valor1 == valor2) {
			System.out.println("los numeros son iguales");
		}

	}

}
