package com;

import java.util.Scanner;

public class Ejercicio10_CALR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Ingresa el numero del mes que desea consultar.");
		int mes;

		// el usuario debe ingresar el numero de mes que desea consultar, si ingresa un
		// numero no aceptado
		// el programa arrojara un mensaje de ERROR

		mes = consola.nextInt();
		switch (mes) {
		case 1:
			System.out.println("El mes de enero tiene 31 dias.");
			break;
		case 2:
			System.out.println("El mes de febrero tiene 28 dias.");
			break;
		case 3:
			System.out.println("El mes de marzo tiene 31 dias.");
			break;
		case 4:
			System.out.println("El mes de abril tiene 30 dias.");
			break;
		case 5:
			System.out.println("El mes de mayo tiene 31 dias.");
			break;
		case 6:
			System.out.println("El mes de junio tiene 30 dias.");
			break;
		case 7:
			System.out.println("El mes de julio tiene 31 dias.");
			break;
		case 8:
			System.out.println("El mes de agosto tiene 31 dias.");
			break;
		case 9:
			System.out.println("El mes de septiembre tiene 30 dias.");
			break;
		case 10:
			System.out.println("El mes de octubre tiene 31 dias.");
			break;
		case 11:
			System.out.println("El mes de noviembre tiene 30 dias.");
			break;
		case 12:
			System.out.println("El mes de diciembre tiene 31 dias.");
			break;
		default:
			System.out.println("ERROR, numero no aceptado");
		}

	}

}
