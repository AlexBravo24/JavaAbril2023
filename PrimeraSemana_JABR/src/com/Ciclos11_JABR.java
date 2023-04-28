package com;

import java.util.Scanner;

public class Ciclos11_JABR {

	public static void main(String[] args) {

		/*11.Dibuja un cuadrado, como en la imagen que acompaña,
		 * Introducir desde teclado el ancho y el alto. 
		 * Ejemplo: 8 x 8
		 * 
		 */
		
		//Declaramos un ciclo for, con una variable de control y
		//dentro de el declaramos otro ciclo for que se encargara
		//de imprimir el simbolo
		int alto, largo;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el ancho del cuadrado");
		alto=input.nextInt();
		System.out.println("Introduce el largo del cuadrado");
		largo=input.nextInt();
		
		for (int j = 0; j < alto; j++) {
			System.out.println();
			for (int i = 0; i < largo; i++) {
				System.out.print(" * ");
			}
		}

	}

}
