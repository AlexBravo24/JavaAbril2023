package com;

import java.util.Scanner;

public class Ejercicio5_DCC {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		  parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA*/
		
		int nota;
		int edad;
		String sexo;
		Boolean sexualidad = null;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce una nota de 0 a 10");
		nota = lector.nextInt();
		System.out.println("Introduce tu edad");
		edad = lector.nextInt();
		System.out.println("Introduce tu sexo");
		sexo = lector.next();
		
		if(sexo.equals("f")||sexo.equals("F")) {
			sexo = "femenino";
		} else if(sexo.equals("m")||sexo.equals("M")) {
			sexo = "masculino";
		}
		
		
		if(nota >= 5 && edad >= 18 && sexo.equals("femenino")) {
			System.out.println("solicitud Aceptada");
		} else if(nota >= 5 && edad >= 18 && sexo.equals("masculino")) {
			System.out.println("solicitud posiblemente aceptada");
		} else {
			System.out.println("solicitud rechazada");
		}

	}

}
