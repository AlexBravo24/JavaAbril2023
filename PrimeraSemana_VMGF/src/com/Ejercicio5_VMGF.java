package com;

import java.util.Scanner;

public class Ejercicio5_VMGF {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptaci�n 
		//de una solicitud en base a los siguientes par�metros:
		//edad, nota y sexo.
		//M�nimo: Nota (5), edad (18), sexo M ->
		//POSIBLE * M�nimo: Nota (5), edad				 (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		int edad;
		int nota ;
		String sexo;
		int s;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Escribe la edad de la persona ");
		s=sc.nextInt();
		edad =(s);
	        
		System.out.println(" Escribe la nota de la persona ");
		s =sc.nextInt();
		nota =(s);
		
		System.out.println(" Escribe el sexo de la persona ");
		sexo = sc.next();
		
		if((edad >=18)&&(nota>=5)&&(sexo.equals("f"))) {
			System.out.println("ACEPTADA");

		}else {
			if((edad >=18)&&(nota>=5)&&(sexo.equals("m"))) {
			System.out.println("POSIBLE");
		    }
			else {
				System.out.println("NO ACEPTADA");	
			}
		 }

		
		
	}

}
