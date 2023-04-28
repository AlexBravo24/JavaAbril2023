package com;

import java.io.IOException;

public class Ejercicio4_CALR {

	public static void main(String[] args) throws IOException{
		char caracter;
        System.out.print("Introduzca un carácter: ");
        caracter = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(caracter)) //utilizamos el método isUpperCase de la clase Character  para verificar si es mayuscula      
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }

	}

}
