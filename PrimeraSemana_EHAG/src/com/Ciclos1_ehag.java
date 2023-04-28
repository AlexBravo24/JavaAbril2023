package com;

import java.util.Scanner;

public class Ciclos1_ehag {

	public static void main(String[] args) {
  Scanner linea = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = linea.nextLine();
        
        System.out.println("Ingrese una letra:");
        char letra = linea.next().charAt(0);
        
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
        
        linea
        .close();

	}

}
