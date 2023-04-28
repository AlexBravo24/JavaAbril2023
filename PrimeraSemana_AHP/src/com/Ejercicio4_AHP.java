package com;

import java.util.Scanner;

public class Ejercicio4_AHP {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado 
		// y compruebe si es una letra mayúscula.
	
		Scanner Num = new Scanner(System.in);
		String caracter ;
		System.out.println("Introduce un solo caracter:");
		caracter = Num.nextLine ();
		
		Num.close();
		
		if(caracter.length()!= 1) {
			System.out.println("No se puede, debes incluir 1 solo caracater");
		}else {
			char Letra = caracter.charAt(0);
			if (Character.isUpperCase(Letra) && Letra >= 'A' && Letra <= 'Z') {
				System.out.println("La letra introducida es mayúscula");
		}else if (Letra >= 'a' && Letra <= 'z'){
			System.out.println("La letra introducida es minúscula");
		}else {
			System.out.println("Solo introduce letras");
		}
		}	
	}	
}		
			
		

//	String original;
//	String cadena;
//	
//	Scanner entrada = new Scanner(System.in);
//	//Declaramos un scanner para introducir la cadena de texto por teclado
//	
//	System.out.println("Introduce una cadena de texto");
//	original = entrada.next(); //Alejandro
//	cadena = original.toLowerCase(); //alejandro
//	
//	//Evaluaríamos si la cadena original es igual a la cadena convertida
//	
//	if (original.equals(cadena)) {
//		System.out.println("El texto en minúsculas");
//	}else {
//		System.out.println("El texto contiene mayúsculas");
//	}
//	}
//}