package com;

//import java.util.Scanner;
//
//public class Ciclos3_AHP {
//
//	public static void main(String[] args) {
//		// 3. Realiza un programa para determinar si un String es palíndromo. 
//		
//		
//		String palabra;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Introduce una palabra: ");
//		palabra = input.next();
//		
//		input.close();
//		
//		boolean es
//		
//	}
//
//}

import java.util.Scanner;

public class Ciclos3_AHP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra ;
        palabra = input.nextLine();
        input.close();

        boolean palin = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                palin = false;
                break;
            }
        }

        if (palin) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }

        
    }
}
