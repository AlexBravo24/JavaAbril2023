package com;

import java.util.Scanner;

public class Ejercicio1_JCGM {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos n�meros por teclado
		//e indique cu�l es mayor o si son iguales.
		
		
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese el primer n�mero: ");
		int x = leer.nextInt();
		
		System.out.println("Ingrese el segundo n�mero: ");
		int y = leer.nextInt();
		
		if(x>y) {
			System.out.println("El n�mero "+ x+ " es mayor a "+y);
		}else if(y>x) {
			System.out.println("El n�mero "+ y+ " es mayor a "+x);
		}else if (x==y) {
			System.out.println("Los n�meros son iguales");
		}

	}

}
