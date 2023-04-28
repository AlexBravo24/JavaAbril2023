package com;

import java.util.Scanner;

public class Ejercicio4eh {

	public static void main(String[] args) {
Scanner caracter = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = caracter.nextLine();
        
        char primerCaracter = cadena.charAt(0);
        
        if (Character.isUpperCase(primerCaracter)) {
            System.out.println("La cadena ingresada tiene letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada no tiene letra mayúscula.");
        }

	}

}
