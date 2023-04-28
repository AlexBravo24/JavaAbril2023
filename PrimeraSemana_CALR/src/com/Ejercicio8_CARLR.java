package com;

import java.util.Scanner;

public class Ejercicio8_CARLR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("ingresa un numero entre el 1 y el 6");
		int dado;

		dado = consola.nextInt();
		switch (dado) {
		case 1:
			System.out.println("En la cara opuesta está el seis.");
			break;
		case 2:
			System.out.println("En la cara opuesta está el cinco.");
			break;
		case 3:
			System.out.println("En la cara opuesta está el cuatro.");
			break;
		case 4:
			System.out.println("En la cara opuesta está el tres.");
			break;
		case 5:
			System.out.println("En la cara opuesta está el dos.");
			break;
		case 6:
			System.out.println("En la cara opuesta está el uno.");
			break;
		default:
			System.out.println("ERROR: número incorrecto.");

		}
	}

}
