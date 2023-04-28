package com;

import java.util.Scanner;

public class Ejercicio1_YGVC {

	public static void main(String[] args) {
		
		/*Realiza un programa que reciba dos números 
		 * por teclado e indique cuál es mayor o si son iguales.
		 * 
		 */
		Scanner s= new Scanner (System.in);
		System.out.println("introduzca Numero Uno ");
		int numUno = s.nextInt();
		System.out.println("Introduzca Numero Dos ");
		int numDos = s.nextInt();
		
		
		if(numUno == numDos) {
			System.out.println("Los numeros son iguales : " + numUno );
			System.out.println("Los nunmeros son iguales : " + numDos );
		}
		
		if (numUno ==numDos) {
			System.out.println("El numero mayor es :" + numUno );
		}else if(numDos > numUno) {
			System.out.println("Numero mayor es :" + numDos);
		}else if(numDos > numUno) {
			System.out.println("Numero mayor es :" + numDos);
		}
		
		}
		}
		
		



