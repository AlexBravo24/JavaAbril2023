package com;

import java.util.Scanner;

public class Ciclos1_YGVC {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la
		 * tabla de multiplicar del 12 
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("-------TABLA DE MULTIPLICAR-----");
		System.out.println("Digite el numero al que quiere generarle la tabla:");
		
		int numero=scanner.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			//numero*i= (numero*i)
			System.out.println(numero+"*"+i+"="+(numero*i));
			
		}
		
		

	}

}
