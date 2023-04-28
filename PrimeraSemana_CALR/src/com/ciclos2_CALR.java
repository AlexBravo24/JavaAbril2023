package com;

import java.util.Scanner;

public class ciclos2_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		// variables
		int valor1, valor2, tabla;
		int contador = 1;

		// solicitud de datos al usuario
		System.out.println("ingrese el numero que desea multiplicar");
		valor1 = escaner.nextInt();
		System.out.println("¿cuantas veces desea multiplicar el numero?");
		valor2 = escaner.nextInt();
		
		System.out.println("tabla del: " + valor1);
		while (contador <= valor2) {
		 tabla = valor1 * contador;
		 System.out.println(tabla);
		 contador++;
		}

	}

}
