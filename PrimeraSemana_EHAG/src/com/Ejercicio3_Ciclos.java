package com;

import java.util.Scanner;

public class Ejercicio3_Ciclos {

	public static void main(String[] args) {
Scanner palindromo = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        String palabra = palindromo.nextLine();
        
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra es pal�ndromo.");
        } else {
            System.out.println("La palabra no es pal�ndromo.");
        }
        
        palindromo.close();

	}

}
