package com;

import java.util.Scanner;
public class Ciclos4_MVNO {
	public static void main(String[] args) {
		/*
		 * Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado
cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
�Car�cter no encontrado�. */
		
		String cadena;
		int pos=0, contador=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase=leer.nextLine();
		System.out.println("Ahora escribe la letra que quieres encontrar dentro de la frase: ");
		String letra=leer.nextLine();
		
		pos=frase.indexOf(letra);
		
		for(int i =0; i<frase.length(); i++){
			if(frase.charAt(i) == letra.charAt(0)) {
				contador++;
		   }
		}
		
		if(contador !=0) {
			System.out.println("En la frase el caracter " + letra.charAt(0) + " se repite " + contador + " veces");
		}
		else {
			System.out.println("Caracter no encontrado");
		}
		
	}
}
