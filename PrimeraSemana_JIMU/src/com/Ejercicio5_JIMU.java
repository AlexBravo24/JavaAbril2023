package com;

import java.util.Scanner;

public class Ejercicio5_JIMU {

	public static void main(String[] args) {
		/*. Realiza un programa que calcule la aceptaci�n de una
		 *  solicitud en base a los siguientes 
		 
   par�metros: edad, nota y sexo.
   M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
   M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
   Otros casos -> NO ACEPTADA */
		
		//Duda: c�mo preguntar por un car�cter??
		
		int nota;
		int edad;
		String sexo;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la nota");
		nota = entrada.nextInt();
		
		System.out.println("Introduce la edad");
		edad = entrada.nextInt();
		
		//System.out.println("Introduce el sexo");
		//sexo = entrada.next();
		
		if (nota>=5 && edad >=18 ) {
		System.out.println("Es posible que sea aprobado");
		
			
	}else if (nota>=5 && edad <=17) {
		System.out.println("Ha sido aprobada");

		
	
}
	}
}
