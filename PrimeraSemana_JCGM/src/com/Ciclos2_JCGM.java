package com;

import java.util.Scanner;

public class Ciclos2_JCGM {

	public static void main(String[] args) {
		
//		 Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		 desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		 23 x 95 = ???
		
		int x; int i;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("De que número quieres la tabla: ");
		x=leer.nextInt();
		
		System.out.println("¿Cuántas iteraciones?: ");
		i=leer.nextInt();
		
		for ( int j = 1; j < i+1; j++) {
			System.out.println(+x+" x "+j+ " = "+x*j);
		}
				
		

	}

}
