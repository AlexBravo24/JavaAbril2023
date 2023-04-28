package com;

import java.util.Scanner;

public class Ciclos2_AHP {

	public static void main(String[] args) {
		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		23 x 95 = ???
*/
		int num;
		int valor;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un valor del que quieras la tabla de multiplicar: ");
		num = input.nextInt();
		System.out.println("Introduce un valor hasta el que quieras multiplicar: ");
		valor = input.nextInt();
		
		input.close();
		
		for (int i = 0; i <= valor ; i+=1) {
			//		System.out.println("Hola mundo");	
					System.out.println( " x "   + i + " = " + (num*i));
		
	}

}
}