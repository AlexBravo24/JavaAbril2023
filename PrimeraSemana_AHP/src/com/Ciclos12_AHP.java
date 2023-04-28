package com;

import java.util.Scanner;

public class Ciclos12_AHP {

	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
cuando el promedio de las edades sea superior a 25
		 */

		Scanner input = new Scanner(System.in);

		int edad  = 0 ; 
		int suma = 0 ;
		double promedio = 0;
		
		while (promedio <= 25) {
		
		System.out.println("introduce una edad: ");
		
		int n = input.nextInt();	
		
		suma += n;
		edad++;
		promedio = (double)suma/edad;
		}
		System.out.println("El promedio de las edades es: "+ promedio);
		input.close();
		
	}


}





