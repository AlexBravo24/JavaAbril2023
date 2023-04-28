package com;

import java.util.Scanner;

public class Ciclos4_JABR {

	public static void main(String[] args) {
		/*4.Programa que reciba una frase y una letra por teclado.
		 * Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase.
		 * Si no existe, imprimir un mensaje “Carácter no encontrado”.
		 */

		String frase, letra; //Necesitamos una variable donde guardar la frase
		//y otra para guardar la letra a buscar
		int contador = 0; //Nos apoyamos en una variable numerica para contar
		//las veces que se encuentra el caracter
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingresa una frase");
		frase = entrada.nextLine();
		System.out.println("Ingresa una letra a encontrar");
		letra = entrada.nextLine();
		entrada.close();
		

	    for (int i = 0; i < frase.length(); i++) {
	      if (frase.charAt(i) == letra.charAt(0)) {
	        contador++;

	      }
	    }

	    if (contador != 0) {
	      System.out.println("El caracter " + letra.charAt(0) + " se repite " + contador + " veces");
	    } else {
	      System.out.println("Caracter no encontrado");
	    }
	}

}
