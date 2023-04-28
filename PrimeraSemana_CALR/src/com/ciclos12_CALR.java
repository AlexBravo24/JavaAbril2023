package com;

import java.util.Scanner;

public class ciclos12_CALR {

	public static void main(String[] args) {
		// declaracion de variables
		int edad, suma = 0, contador = 0, promedio = 0, h = 1;
		Scanner consola = new Scanner(System.in);

		// operaciones y muestra de resultados
		do {
			System.out.println("Ingresa la edad de la persona " + h);
			h = h + 1;
			edad = consola.nextInt();
			suma = suma + edad;
			contador = contador + 1;
			promedio = suma / contador;

			// imprime resultados
			System.out.println("El promedio es " + promedio);
			System.out.println("-_-_-_-_-_-_-_-_-_-_-");
			if (promedio > 25) {
				break;
			}
		} while (edad > 0);
		
	}

}
