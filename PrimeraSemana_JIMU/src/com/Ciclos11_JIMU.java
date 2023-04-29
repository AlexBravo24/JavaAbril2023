package com;

import java.util.Scanner;

public class Ciclos11_JIMU {

	public static void main(String[] args) {
		/*11.Dibuja un cuadrado, como en la imagen que 
		 * acompaña, introducir desde teclado el 
		 ancho y el alto. Ejemplo: 8 x 8*/
		
		int ancho, alto;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el ancho del cuadro");
		ancho = entrada.nextInt();
		System.out.println("Introduce el alto del cuadro");
		alto = entrada.nextInt();
		
		
		
		for (int i=0;i<alto;i++) {
			for (int j=0; j<ancho;j++) {
				System.out.print("* ");
				
			}
			System.out.print("\n");
		}
		
	}

}
