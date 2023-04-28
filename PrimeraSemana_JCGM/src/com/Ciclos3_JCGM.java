package com;

import java.util.Scanner;

public class Ciclos3_JCGM {

	public static void main(String[] args) {
		
		//Realiza un programa para determinar si un String es palíndromo
		
		Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = leer.nextLine().toLowerCase();
        int longitud = palabra.length();
        boolean esPalindromo = true;

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo==true) {
            System.out.println("La palabra " + palabra + " es palíndromo");
            
        } else {
            System.out.println("La palabra " + palabra + " no es palíndromo");
            
        }

	}

}
