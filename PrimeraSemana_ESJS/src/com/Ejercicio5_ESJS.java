package com;

import java.util.Scanner;

public class Ejercicio5_ESJS {

	public static void main(String[] args) {
//		// Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
//		par�metros: edad, nota y sexo.
//		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		Scanner scanner = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;
	
	    System.out.print("Edad: ");
	    edad = scanner.nextInt();
	    
	    System.out.print("Nota: ");
	    nota = scanner.nextInt(); 
	    scanner.nextLine();
	    
	    System.out.print("Sexo (M o F): ");
	    sexo = scanner.nextLine();
	    
	
	    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	      System.out.println("El valor de sexo introducido es incorrecto.\n" + "por favor, reenv�e el formulario.");
	      
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	      
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	       
	    }else {
	        System.out.println("NO ACEPTADA");
	    }

	}

}