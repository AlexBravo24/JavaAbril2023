package com;

import java.util.Scanner;

public class Ciclos2_JIMU {

	public static void main(String[] args) {
		/*
		 * 2.- Programa un algoritmo que realice la tabla de 
		 * multiplicar de un numero introducido 
         desde teclado, hasta la iteraci�n deseada por el usuario. 
           Ejemplo, tabla de 23 hasta el 95. 
                    23 x 95 = ??
		 */

		int resultado;
		int numeroUno;
		int numeroDos;
	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el n�mero inicial");
		numeroUno = entrada.nextInt();
		System.out.println("Introduce el n�mero final");
		numeroDos = entrada.nextInt();
		int tabla = numeroUno;
		
		for (int i=numeroUno; i<numeroDos+1;i++) {
			resultado = i*tabla;
			System.out.println(resultado);
			tabla ++;
			
		}
		
	}

}
