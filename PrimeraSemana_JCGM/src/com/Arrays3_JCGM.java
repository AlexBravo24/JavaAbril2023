package com;

import java.util.Scanner;

public class Arrays3_JCGM {

	public static void main(String[] args) {
		
//		Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//		caracteres
		
		Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = leer.nextLine();

        char[] arrayCaracteres = frase.toCharArray();

        System.out.print("Los caracteres de la frase son: ");
        for (char c : arrayCaracteres) {
            System.out.println(c + " ");
        }

	}

}
