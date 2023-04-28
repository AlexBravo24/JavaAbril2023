package com;

import java.util.Scanner;

public class Ejercicio6_ACS {

	public static void main(String[] args) {

		//

		Scanner scanner = new Scanner(System.in);
		int kilos;
		Double precioinicial;
		String tipo;
		int tamano;

		System.out.print("Introduce los Kilos de uva entregada: ");
		kilos = scanner.nextInt();
		System.out.print("Introduce el precio inicial: ");
		precioinicial = (double) scanner.nextInt();
		System.out.print("Introduce de que tipo es A o B: ");
		tipo = scanner.next();
		scanner.hasNextLine();
		System.out.print("Que tamaño es 1 o 2: ");
		tamano = scanner.nextInt();

		if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamano == 1 || tamano == 2))) {
			System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
		} else {
			if (tipo.toUpperCase().equals("A") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) + (kilos * 0.20)));
			} else if (tipo.toUpperCase().equals("A") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) + (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) - (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) - (kilos * 0.50)));
			}
		}

	}

}
