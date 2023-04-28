package com;

import java.util.Scanner;

public class ciclos4_CALR {

	public static void main(String[] args) {
		 Scanner consola = new Scanner(System.in);
		 String frase, letra;
		 int contador = 0;
		 
		 
		 
		 System.out.println("ingrese una frase");
		 frase = consola.nextLine();
		 System.out.println("ingresa la letra que deseas buscar en la frase");
		 letra = consola.nextLine();
		 
		 for(int i = 0; i < frase.length(); i++) {
			 if(frase.charAt(i) == letra.charAt(0)) {
				 contador++;
			 }
		 }
		 if (contador != 0) {
			 System.out.println("El caracter " + letra.charAt(0) + " se repite " + contador + " veces");
		 } else {
			 System.out.println("caracter no encontrador");
		 }

	}

}
