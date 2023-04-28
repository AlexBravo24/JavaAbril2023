package com;

import java.util.Scanner;

public class Ejercicio2_ACS {

	public static void main(String[] args) {
	
		//2.Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar.
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Ingrese el numero a evaluar: ");
		n = teclado.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " Es un numero par ");
		}else {
			System.out.println(n + " Es un numero impar ");
		}

	}

}
