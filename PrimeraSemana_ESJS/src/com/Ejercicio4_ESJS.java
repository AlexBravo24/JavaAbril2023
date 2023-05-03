package com;

import java.util.Scanner;

public class Ejercicio4_ESJS {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner (System.in);
	    String cadena;
	    
	   
	    System.out.print("Introduce la cadena que desees (TEXTO): ");
	    cadena = scan.nextLine();
	    
	    if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	       System.out.println("La cadena es una letra mayúscula.");
	    }else {
	        System.out.println("La cadena no es una letra mayúscula.");
	    }

	}

}
