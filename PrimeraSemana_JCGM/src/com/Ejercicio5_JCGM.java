package com;

import java.util.Scanner;

public class Ejercicio5_JCGM {

	public static void main(String[] args) { 
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
	        Scanner leer = new Scanner(System.in);
	        System.out.println("Ingrese su edad: ");
	        int edad = leer.nextInt();
	        System.out.println("Ingrese su nota: ");
	        int nota = leer.nextInt();
	        System.out.println("Ingrese su sexo (M o F): ");
	        String sexo = leer.next();
	        
	        if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
	            System.out.println("POSIBLE");
	        } else if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
	            System.out.println("ACEPTADA");
	        } else {
	            System.out.println("NO ACEPTADA");
	        }
	        
	       
	    }
	}

