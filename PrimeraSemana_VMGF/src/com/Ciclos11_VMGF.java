package com;

import java.util.Scanner;

public class Ciclos11_VMGF {

	public static void main(String[] args) {
		// cuadrado
		
		int ancho, largo;
		Scanner input = new Scanner(System.in);
		System.out.println("introduce el ancho del cuadrado");
		ancho=input.nextInt();
		System.out.println("introduce el largo del cuadrado");
		largo=input.nextInt();
		
		for (int j=0; j<ancho; j++) {
			System.out.println();
			for (int i=0; i<largo; i++) {
				System.out.print("*");
				
			}
			//System.out.println("");
		}

		
		
		
	}

}
