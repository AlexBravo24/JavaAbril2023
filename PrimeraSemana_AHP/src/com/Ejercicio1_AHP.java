package com;

import java.util.Scanner;

public class Ejercicio1_AHP {

	public static void main(String[] args) {
		//Para cada ejercicio se cre una nueva Clase !
		
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales
		
		
		int Alfa; // Declaro una variable donde pueda guardar

		Scanner A1 = new Scanner(System.in);
		// Iniciamos un objeto de la clase Scanner, que permite introducir valores por
		// teclado,
		// ya sean caracteres o n�meros, etc
		System.out.println("Introduce un n�mero para Alfa:");
		Alfa = A1.nextInt();
		
		
		int Bravo; // Declaro una variable donde pueda guardar

		System.out.println("Introduce un n�mero para Bravo:");
		Bravo = A1.nextInt();
		
		A1.close();
		
		if  (Alfa == Bravo) {
			System.out.println("Alfa y Bravo el mismo valor");
		} 
		else if (Alfa < Bravo){
			System.out.println("El valor Alfa es menor");
}		
		else if (Alfa > Bravo) {
			System.out.println("El valor Alfa es mayor");
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
