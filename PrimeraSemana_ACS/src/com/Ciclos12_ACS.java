package com;

import java.util.Scanner;

public class Ciclos12_ACS {

	public Ciclos12_ACS() {

	}

	public static void main(String[] args) {

		// Se ingresan un conjunto de n edades de personas por
		// teclado. El programa finalizara
		// cuando el promedio de las edades sea superior a 25.

		Scanner sc = new Scanner(System.in);

		int edad;
		double promedio = 0.0;
		int contador = 0;
		int suma = 0;

		do {
			System.out.println("Ingresa la edad");
			edad = sc.nextInt();
			contador++; // le decimo al contador que empiece a contar
			suma = suma + edad;

			promedio = (suma / contador);
		} while (promedio <= 25);

		System.out.println(promedio);
		System.out.println("El promedio es: " + promedio + "\nEl conteo de la edades es de: " + contador);

	}

}
