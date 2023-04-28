package com;

import java.util.Scanner;

public class Ciclos11_AJCG {

	public static void main(String[] args) {
		Scanner lector=new Scanner (System.in);
		System.out.println("Ingresa el ancho del cubo:");
		int ancho;
		ancho=lector.nextInt();
		System.out.println("Ingresa el alto del cubo:");
		int alto;
		alto=lector.nextInt();
		lector.close();
		int i=0;
		while (i<alto) {
			System.out.println();
			i++;
			int x=0;
			while (x<ancho) {
				System.out.print(" * ");
				x++;
			}
		}
		
		

	}

}
