package com;

import java.util.Scanner;

public class Arrays3_EHAG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce una frase: ");
	    String frase = scanner.nextLine();
	    
	    char[] caracteres = frase.toCharArray();
	    
	    System.out.println("Los caracteres de la frase son:");
	    for (int i = 0; i < caracteres.length; i++) {
	      System.out.print(caracteres[i] + " ");
	    }

	}

}
