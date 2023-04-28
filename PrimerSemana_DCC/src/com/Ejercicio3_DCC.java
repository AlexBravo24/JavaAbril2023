package com;

import java.util.Scanner;

public class Ejercicio3_DCC {
	public static void main(String[] args) {
		/*---Crea un programa que pida al usuario dos números 
		     y muestre el resultado de su división. Si el
			 segundo número es 0, 
			 debe mostrar un mensaje de error ---- */
		double valor1;
		double valor2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero");
		valor1 = lector.nextInt();
		
		System.out.println("Introduce un segundo numero");
		valor2 = lector.nextInt();
		
		if (valor2 == 0) {
			System.out.println("El segundo valor debe ser diferente de cero");
		} else {
			double divicion;
			
			divicion = valor1 / valor2 ;
			
		    System.out.println("El resultado de la division es: " + divicion);
		}
		
	}
}
