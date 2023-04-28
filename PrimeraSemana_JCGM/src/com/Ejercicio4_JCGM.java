package com;

import java.util.Scanner;

public class Ejercicio4_JCGM {

	public static void main(String[] args) {
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		Scanner leer = new Scanner (System.in);
		
		
		System.out.print("Introduce una cadena: ");
        String original = leer.nextLine();
        String cadena = original.toLowerCase();
        
        if(original.equals(cadena)) {
        	System.out.println("El texto esta en minusculas.");
        }else {
        	System.out.println("El texto tiene mayusculas.");
        }
        
    }
	

}
