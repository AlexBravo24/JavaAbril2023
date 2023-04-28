package com;

import java.util.Scanner;

public class Ejercicio2_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*--Realiza un programa que pida un número por teclado y nos indique si es par o impar--*/
		
		int valor;
		int residuo;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		valor = lector.nextInt();
		
		residuo = valor % 2;
		
		
		if(residuo == 0) {
			System.out.println("El numero que ingrsaste es par");
		} else {
			System.out.println("El numero que ingrsaste es inpar");
		}

	}

}
