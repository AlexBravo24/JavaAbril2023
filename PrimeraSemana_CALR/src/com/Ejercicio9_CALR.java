package com;

import java.util.Scanner;

public class Ejercicio9_CALR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Ingresa el dia de la semana.");
		int dia;

		// el usuario ingresa un valor aceptable, sino el programa mandara un error.
		dia = consola.nextInt();
		switch (dia) {
		case 1:
			System.out.println("El dia de la semana es Lunes.");
			break;
		case 2:
			System.out.println("El dia de la semana es Martes.");
			break;
		case 3:
			System.out.println("El dia de la semana es Miercoles");
			break;
		case 4:
			System.out.println("El dia de la semana es Jueves.");
			break;
		case 5:
			System.out.println("El dia de la semana es Viernes.");
			break;
		case 6:
			System.out.println("El dia de la semana es Sabado.");
			break;
		case 7:
			System.out.println("El dia de la semana es Domingo.");
			break;
		default:
			System.out.println("ERROR, numero no aceptado");
		}

	}

}
