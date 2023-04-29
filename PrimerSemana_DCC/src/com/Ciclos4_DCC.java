package com;

import java.util.Scanner;

public class Ciclos4_DCC {

	public static void main(String[] args) {
		/*Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		“Carácter no encontrado”.*/
		
		String palabra;
		char caracter;
		int contador = 0;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingese una palabra");
		palabra = lector.next();
		System.out.println("Ingrese una letra");
		caracter = lector.next().charAt(0);
		
		for(int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == caracter) {
				contador++;
			} 
		}
		
		if(contador != 0) {
			System.out.println("Caracter encontrado " + contador + " veces");
		} else {
			System.out.println("Caracter no encontrado");
		}
			
	}
		

}

