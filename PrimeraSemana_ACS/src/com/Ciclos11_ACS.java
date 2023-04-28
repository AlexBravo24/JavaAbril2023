package com;

import java.util.Scanner;

public class Ciclos11_ACS {

	public Ciclos11_ACS() {

	}

	public static void main(String[] args) {

		// Dibuja un cuadrado, como en la imagen que acompaña,
		// introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8

		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < 8; k++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");

		}

	}

}
