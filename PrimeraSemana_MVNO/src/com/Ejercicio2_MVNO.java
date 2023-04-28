package com;
import java.util.Scanner;
public class Ejercicio2_MVNO {
	public static void main(String[] args) {
		/*Realiza un programa que pida un número por teclado y nos indique si es par o impar*/
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int num=leer.nextInt();
		
		if(num %2 == 0) {
			System.out.println("El numero " + num + " es PAR");
		}
		else {
			System.out.println("El numero " + num + " es IMPAR");
		}
	}
 
}
