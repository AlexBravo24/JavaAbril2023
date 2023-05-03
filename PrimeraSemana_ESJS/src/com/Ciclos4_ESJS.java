package com;

import java.util.Scanner;

public class Ciclos4_ESJS {

	public static void main(String[] args) {
//		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”. 
		
		String frase;
		char letra;
		int contador=0;


		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Dime la frase: ");
		frase=entrada.nextLine();
		
		System.out.println("Dame la letra que quieres saber cuantas veces se repite dentro de la frase ");
		letra= entrada.next().charAt(0);
		char comparar;
		 
		for (int i = frase.length() - 1; i >= 0; i--) {
			
			comparar =frase.charAt(i);
			
			if(comparar==letra) {
				contador++;
				
			}else {
				
			}
			
		}
		System.out.println("cantidad repetida de la letra "+letra+" es de "+contador);
		
		
		
	}

}
