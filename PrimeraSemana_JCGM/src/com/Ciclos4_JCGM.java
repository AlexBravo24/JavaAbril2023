package com;

import java.util.Scanner;

public class Ciclos4_JCGM {

	public static void main(String[] args) {
		
//		//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”
		
		Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = leer.nextLine();
        System.out.println("Introduce una letra: ");
        String letra = leer.nextLine().substring(0, 1); // Tomamos solo la primera letra ingresada
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
                contador++;
               
            }
        }

        if (contador > 0) {
            System.out.println("La letra " + letra + " aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
		

	}

}
