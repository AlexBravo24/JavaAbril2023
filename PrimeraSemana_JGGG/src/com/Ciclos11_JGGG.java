package com;

import java.util.Scanner;

public class Ciclos11_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		ancho y el alto. Ejemplo: 8 x 8
	 */
	int num1=0;
	int num2=0;

	Scanner entrada = new Scanner(System.in);
	System.out.println("Dame la altura: ");
	num1=entrada.nextInt();
	System.out.println("Dame el ancho: ");
	num2=entrada.nextInt();
	
	for (int fila = 1; fila <= num1; fila++) {
		for (int columna = 1; columna <= num2; columna++) {
			System.out.print("*");
			
	}
		
	System.out.println();//Salto para linea

	}
	}
}
