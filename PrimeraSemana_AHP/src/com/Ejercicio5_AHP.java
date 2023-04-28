package com;

import java.util.Scanner;

public class Ejercicio5_AHP {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo. Mínimo: Nota (5), edad (18),
		 * sexo M -> POSIBLE Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA Otros casos
		 * -> NO ACEPTAD
		 */

		int nota ;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la nota:");
		nota = input.nextInt();

		int edad;
		System.out.println("Introduce la edad");
		edad = input.nextInt();
		
		String  caracter;
		System.out.println("Introduce M para Masculino y F para Femenino:");
		caracter = input.next();
	
		
		

		input.close();
		
		if (caracter.length() != 1) {
			System.out.println("No se puede, debes incluir 1 solo caracater");
		} else {
			 caracter.charAt(0);
		}

		if (nota >= 5 && edad == 18 && caracter.charAt(0) == ('M')) {
			System.out.println("Nota: " + nota);
			System.out.println("Edad: " + edad);
			System.out.println("Sexo: " + caracter);
			System.out.println("Estado: POSIBLE");
		} else if (nota >= 5 && edad == 18 && caracter.charAt(0) == 'F') {
			System.out.println("Nota: " + nota);
			System.out.println("Edad: " + edad);
			System.out.println("Sexo: " + caracter);
			System.out.println("Estado: ACEPTADA");

		} else {

			System.out.println("Nota: " + nota);
			System.out.println("Edad: " + edad);
			System.out.println("Sexo: " + caracter);

			System.out.println("Estado: NO ACEPTADO");
		}
	}
}

/*
 * int nota, edad; String sexo; Scanner input = new Scanner(System.in);
 * System.out.println("Ingresa una nota"); nota = input.nextInt ();
 * System.out.println("Introduce una edad"); edad = input.nextInt();
 * System.out.println("Ingresa seco M/F"); sexo = input.next ();
 * 
 * input.close();
 * 
 * if(nota >= 5 && edad >=18 && sexo.equalsIgnoreCase('M')) {
 * System.out.println("POSIBLE"); }else if (nota >= 5 && edad >=18 &&
 * sexo.equalsIgnoreCase('F')) { System.out.println("ACEPTADO"); }else {
 * System.out.println("NO ACEPTADO"); } } }
 */