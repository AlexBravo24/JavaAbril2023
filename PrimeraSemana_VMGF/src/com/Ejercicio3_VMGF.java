package com;

import java.util.Scanner;

public class Ejercicio3_VMGF {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el 
		//resultado de su división. Si el segundo número es 0, debe mostrar
		//un mensaje de error.
		
		double nume1;
		double nume2;
		double resultado;


		Scanner lect1 = new Scanner(System.in);
		System.out.println("introduce el primer número");
		nume1 = lect1.nextInt();

		Scanner lect2 = new Scanner(System.in);
		System.out.println("intruduce el segundo numero");
		nume2 = lect2.nextInt();

		if (nume1 !=0) {
			resultado = nume1/nume2;
		System.out.println( " Es resultado de la division es" + resultado);
		} else  {
		System.out.println(" El segundo numero es igual a cero" );

		}

	}

}
