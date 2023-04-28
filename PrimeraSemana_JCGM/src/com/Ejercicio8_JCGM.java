package com;

import java.util.Scanner;

public class Ejercicio8_JCGM {

	public static void main(String[] args) {
		
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
//		“ERROR: número incorrecto”.
		String cadena;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el resultado de su dado: ");
		int dado = leer.nextInt();
		
		switch (dado) {
		case 1:
			cadena="Seis";			
			System.out.println("La cara opuesta es: "+cadena);			
			break;
		
		case 2:
			cadena="Cinco";
			System.out.println("La cara opuesta es: "+cadena);
			break;
		
		case 3:
			cadena="Cuatro";
			System.out.println("La cara opuesta es: "+cadena);
			break;
			
		case 4:
			cadena="Tres";
			System.out.println("La cara opuesta es: "+cadena);
			break;
			
		case 5:
			cadena="Dos";
			System.out.println("La cara opuesta es: "+cadena);
			break;
			
		case 6:
			cadena="Uno";
			System.out.println("La cara opuesta es: "+cadena);
			break;

		default:
			System.out.println("Número incorrecto");
			break;
		}

		
		
		

	}

}
