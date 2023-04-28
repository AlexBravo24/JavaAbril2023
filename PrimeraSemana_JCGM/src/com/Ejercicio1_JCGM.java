package com;

import java.util.Scanner;

public class Ejercicio1_JCGM {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos números por teclado
		//e indique cuál es mayor o si son iguales.
		
		
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese el primer número: ");
		int x = leer.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
		int y = leer.nextInt();
		
		if(x>y) {
			System.out.println("El número "+ x+ " es mayor a "+y);
		}else if(y>x) {
			System.out.println("El número "+ y+ " es mayor a "+x);
		}else if (x==y) {
			System.out.println("Los números son iguales");
		}

	}

}
