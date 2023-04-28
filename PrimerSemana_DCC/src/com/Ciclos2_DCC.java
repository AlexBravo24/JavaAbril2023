package com;

import java.util.Scanner;

public class Ciclos2_DCC {

	public static void main(String[] args) {
		/*--Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		23 x 95 = ???--*/
		
		int i;
		int j;
		int contador;
		int maximo;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un numero para poder realizar la tabla del numero correspondiente");
		i = lector.nextInt();
		System.out.println("Introduce hasta que iteracion quieres que se realice la tabla");
		j = lector.nextInt();
		
		maximo = i*j;
		contador = i;
		
		while(i <= maximo) {
			System.out.println(i);
			i= i + contador;
		}
	}

}
