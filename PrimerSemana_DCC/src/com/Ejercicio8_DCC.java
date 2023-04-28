package com;

import java.util.Scanner;

public class Ejercicio8_DCC {
	public static void main(String[] args) {
		/*-- Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
		obtenido.
		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
		“ERROR: número incorrecto”.--*/
		
		int caraDado;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Se ha lanzado un dado escoge el numero que desees del 1 al 6");
		caraDado = lector.nextInt();
		
		switch(caraDado) {
			case 1: System.out.println("La cara opuesta es: 6");
			break;
			
			case 2: System.out.println("La cara opuesta es: 5");
			break;
			
			case 3: System.out.println("La cara opuesta es: 4");
			break;
			
			case 4: System.out.println("La cara opuesta es: 3");
			break;
			
			case 5: System.out.println("La cara opuesta es: 2");
			break;
			
			case 6: System.out.println("La cara opuesta es: 1");
			break;
			
			default: System.out.println("Error, inserta un numero del 1 al 6");
		}
	}
}
