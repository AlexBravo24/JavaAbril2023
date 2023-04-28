package com;

import java.util.Scanner;

public class Ejercicio6_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int kilos;
		double precioInicial;
		String tipo;
		int tamano;
		
		// Solicitud de datos al usuario
		System.out.println("Este programa calcula la ganancia seg�n el tipo de vino, tama�o y cantidad vendida:");
		System.out.print("Introduce los Kg. de uva entregada: ");
		kilos = escaner.nextInt();
		System.out.print("Precio por Kg. inicial: ");
		precioInicial = escaner.nextDouble();
		System.out.print("Uva de valor \"A\" � \"B\": ");
		tipo = escaner.next();
		escaner.nextLine();
		System.out.print("Tipo de uva \"1\" � \"2\": ");
		tamano = escaner.nextInt();
		
		
		// Realizamos C�lculos y mostramos en pantalla
		if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamano == 1 || tamano == 2))) {
			System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
		} else {
			if (tipo.toUpperCase().equals("A") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioInicial) + (kilos * 0.20)));
			} else if (tipo.toUpperCase().equals("A") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioInicial) + (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioInicial) - (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioInicial) - (kilos * 0.50)));
			}
		}

	}

}
