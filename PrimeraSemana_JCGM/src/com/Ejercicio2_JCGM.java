package com;

import java.util.Scanner;

public class Ejercicio2_JCGM {
	
	public static void main(String[] args) {
		
//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese su número: ");
		int x = leer.nextInt();
		
		if (x % 2 == 0) {
		    System.out.println(x + " es par");
		} else {
		    System.out.println(x + " es impar");
		}
		
	}
}
