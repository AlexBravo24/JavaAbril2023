package com;

import java.util.Scanner;

public class Ejercicio2_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		int entero;
		System.out.println("Inserte un número cualquiera:");
		entero=lector.nextInt();
		
		if (entero % 2==0) {
			System.out.println(entero + " es un numero par");
		} else {
			System.out.println(entero + " es un numero impar");
		}

	}//FIN DE STRING

}//CIERRE DE CODIGO
