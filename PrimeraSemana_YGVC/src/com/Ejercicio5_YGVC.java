package com;

import java.util.Scanner;

public class Ejercicio5_YGVC {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptaci�n de
		 *  una solicitud en base a los siguientes 
		 *  par�metros: edad, nota y sexo.
		 * * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * *M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * * Otros casos -> NO ACEPTADA
		 * 
		 */
		
		int nota, edad;
		String sexo;
		Scanner input = new Scanner(System.in);
		nota = input.nextlnt;
		System.out.println("ingresa sexo M/F");
		sexo= input.next();
		
		input.close();
		
		if(nota>=5  edad>=18  sexo.equalsIgnoreCase("M")) {
				System.out.println("Posible");
		}
		
		
	}

}
