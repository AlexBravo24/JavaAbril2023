package com;

import java.util.Scanner;

public class Ciclos11_MVNO {
	public static void main(String[] args) {
		/* .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
ancho y el alto. Ejemplo: 8 x 8 */
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingresa el numero de * que deseas");
		int num=leer.nextInt();
		
			 
			for(int i=0;i<num;i++){
				System.out.println();
				for(int j=0;j<num;j++){
					System.out.print("*");
				}
			}
		

		 }


		
	}

