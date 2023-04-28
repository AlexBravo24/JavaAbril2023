package com;

import java.util.Scanner;

public class Ciclo11_YGVC {

	public static void main(String[] args) {
		/*Dibuja un cuadrado, como en la imagen que acompaña, 
		 * introducir desde teclado el ancho y el alto. 
		 * Ejemplo: 8 x 8
		 * 
		 */
		
		//dentro de el declaramos ptro ciclo for que
		//de imprimir el simbolo
		int ancho, largo;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el ancho del cuadrado");
		ancho=input.nextInt();
		System.out.println("Introduce el largo del cuadrado");
		largo=input.nextInt();
		
		for (int j =0; j < ancho; j++) {
			System.out.println();
			for  (int i = 0; i < largo; i++) {
				System.out.print(" * ");
			}
		}
		
		
		

	}

}
