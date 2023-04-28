package com;

import java.util.Scanner;

public class Ejercicio4_JABR {
	
	public static void main(String[] args) {
		
		/*4. Realiza un programa que lea una cadena por teclado
		 *  y compruebe si es una letra mayúscula.
		 * 
		 */
		
		//Declarariamos una variable original de una cadena de texto
		//Declarariamos otra variable llamada cadena
		//para poder comparar ambas
		
		String original;
		String cadena;
		
		//Declaramos un scanner para introducir la cadena de texto
		//por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		original = entrada.next(); //Alejandro
		cadena = original.toLowerCase(); //alejandro
		
		//Evaluariamos si la cadena original es igual a la cadena convertida
		
		if(original.equals(cadena)) {
			System.out.println("El texto esta en minusculas");
		}else {
			System.out.println("El texto contiene mayúsculas");
		}
		
	}

}
