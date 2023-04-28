package com;

import java.util.Scanner;

public class Ciclos2_MVNO {
	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???*/
		Scanner leer=new Scanner(System.in);
		
		System.out.println("escribe la tabla: ");
		int tabla=leer.nextInt();
		System.out.println("Escribe el numero de las iteraciones que deseas: ");
		int in=leer.nextInt();
		
        for(int i = 1 ; i<= in; i++){
            System.out.println(tabla + " * " + i + " = " + tabla*i);                                                     
       }
	}
}
