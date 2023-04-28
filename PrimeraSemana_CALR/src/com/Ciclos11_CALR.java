package com;

import java.util.Scanner;

public class Ciclos11_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int alto, largo;
		
		System.out.println("introduce el ancho del cuadrado");
		alto = escaner.nextInt();
		System.out.println("introduce el largo del cuadrado");
		largo = escaner.nextInt();
		
		for ( int i = 0; i < alto; i++) {		
			for (int j = 0; j < largo; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}
