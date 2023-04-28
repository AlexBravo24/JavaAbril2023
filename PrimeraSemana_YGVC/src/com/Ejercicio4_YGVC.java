package com;

import java.util.Scanner;

public class Ejercicio4_YGVC {

	public static void main(String[] args) {
		/* Realiza un programa que lea una cadena por teclado
		 *  y compruebe si es una letra mayúscula.
		 * 
		 */
		
		String original;
		String cadena;
		
		//Declaramos un scanner para introducir la cadena de texto
		//por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		original = entrada.next(); //Yocelin
		cadena= original.toLowerCase(); //yocelin
		
		//evaluariamos si la cadena original es igual a la cadena convertida
		
		if(original.equals(cadena)) {
			System.out.println("El texto esta en miniscula");
		}else {
			System.out.println("El texto contine mayusculas");
			
			
		}

	}

}
