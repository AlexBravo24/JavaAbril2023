package com;
import java.util.Scanner;
public class Ejercicio4_MVNO {
	public static void main(String[] args) {
		/*. Realiza un programa que lea una cadena por teclado y 
		 * compruebe si es una letra may�scula.*/
		Scanner scanner = new Scanner (System.in);
	    String cadena;
	    
	    System.out.print("Introduce la cadena que desees: ");
	    cadena = scanner.nextLine();
	    
	    if((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	    	 System.out.println("La cadena es una letra may�scula.");
	    }
	    else {
	    	System.out.println("La cadena no es una letra may�scula.");
	    }
	}

}
