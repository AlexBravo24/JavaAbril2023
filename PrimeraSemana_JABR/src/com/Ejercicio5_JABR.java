package com;

import java.util.Scanner;

public class Ejercicio5_JABR {

	public static void main(String[] args) {
		
		/*5. Realiza un programa que calcule la aceptaci�n de una solicitud 
		 * en base a los siguientes par�metros: edad, nota y sexo.
		 * 
		 * * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * * Otros casos -> NO ACEPTADA
		 *
		 */
		
		int nota, edad;
		String sexo;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa una nota");
		nota = input.nextInt();
		System.out.println("Introduce una edad");
		edad = input.nextInt();
		System.out.println("Ingresa sexo M/F");
		sexo = input.next();
		
		input.close();
		
		if(nota >=5 && edad>=18 && sexo.equalsIgnoreCase("M")){
			System.out.println("Posible");
		}else if(nota >=5 && edad>=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Aceptada");
		}else {
			System.out.println("No Aceptada");
		}

	}

}
