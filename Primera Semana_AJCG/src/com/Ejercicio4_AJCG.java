package com;

import java.util.Scanner;


public class Ejercicio4_AJCG {

	public static void main(String[] args) {
		
		String original;
		String cadena;
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Introduce una cadena de texto:");
		original=entrada.next();
		cadena=original.toLowerCase();
		entrada.close();
		if (original.equals(cadena)) {
			System.out.println("El texto está en minusculas");
		} else {
			System.out.println("El texto contiene mayusculas");
		}

	}//FIN MAIN

}//FIN CODIGO
