package com;

import java.util.Scanner;

public class Ejercicio2_AHP {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.

		Scanner A1 = new Scanner(System.in);
		int Alfa; 

		System.out.println("Introduce un n�mero entero:");
		Alfa = A1.nextInt();
		
		A1.close();
		
		if (Alfa % 2 == 0 ) {
			System.out.println(Alfa+ " es un n�mero par");
		} else {
				System.out.println(Alfa+ " es un n�mero impar");
			}
		}
		
	}

