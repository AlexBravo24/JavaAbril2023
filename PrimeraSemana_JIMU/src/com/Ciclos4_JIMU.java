package com;

import java.util.Scanner;

public class Ciclos4_JIMU {

	public static void main(String[] args) {
		/*
		 * .Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
“Carácter no encontrado”. 
		 */
Scanner entrada = new Scanner(System.in);
		
		String frase; // se declaran variables
		int largo, contador=0;
		char letra;
		
		System.out.print("Ingrese una frase: ");//se solicita la cadena
		frase = entrada.nextLine();
		
		System.out.print("Ingrese una letra a buscar: ");//se solicita la cadena
		letra = entrada.next().charAt(0);
		entrada.close();
		
		largo= frase.length();
		
		for(int i=0; i<largo;i++) {
			
			if(frase.toLowerCase().charAt(i)==Character.toLowerCase(letra)) {
				contador++;
			}
			
		}
		
		if(contador==0) {
			System.out.println("\nNo se encontro la letra '"+letra +"' en la frase");
		}
		else {
			System.out.println("\nLa letra '"+letra+"' se encontrÃ³ "+contador+
					" vez(es) en la frase");
		}
		
		

	}

}



