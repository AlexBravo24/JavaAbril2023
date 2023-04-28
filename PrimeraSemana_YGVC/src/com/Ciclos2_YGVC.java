package com;

import java.util.Scanner;

public class Ciclos2_YGVC {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de 
		 *multiplicar de un numero introducido
		 *desde teclado, hasta la iteración deseada por
		 *el usuario. Ejemplo, tabla de 23 hasta el 95. 
		 *23 x 95 = ???
		 * 
		 */
		
		Scanner teclea = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int factor1 = teclea.nextInt();
		
		for(int factor2=1;factor2<=95;factor2++) {
			System.out.println(factor1+"*"+factor2+" = " +(factor1*factor2));
			
			
		}
		}
				
	}

