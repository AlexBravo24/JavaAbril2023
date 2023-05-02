package com;

import java.util.Scanner;

public class Ciclos11_DCC {

	public static void main(String[] args) {
		int ejeX;
		int ejeY;
		char caracter = '*';
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Acontinuacion dibujaremos un cuadrado con caracteres ayudanos con el numero de filas y columnas");
		System.out.println();
		System.out.println("Ingrese el numero de filas");
		ejeX = lector.nextInt();
		System.out.println("Ingrese el numero de columnas");
		ejeY = lector.nextInt();
		
		for(int i = 0; i < ejeX; i++) {;
			for(int j = 0; j < ejeY; j++) {
				System.out.print("*");
				System.out.println("*");
				
			}
		}

	}

}
