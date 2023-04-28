package com;

import java.util.Scanner;

public class Ciclos8_DCC {

	public static void main(String[] args) {
		
		/*Programa Java que lea dos números y muestre los números desde el menor hasta el
		mayor */
		
		int i;
		int j;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero");
		i = lector.nextInt();
		System.out.println("Introduce un segundo numero");
		j = lector.nextInt();
		
		if(i<j) {
			for(i = i; i <= j ; i++) {
				System.out.println(i);
			}
		} else {
			for(j = j; j <= i ; j++) {
				System.out.println(j);
			}
		}
		

	}

}
