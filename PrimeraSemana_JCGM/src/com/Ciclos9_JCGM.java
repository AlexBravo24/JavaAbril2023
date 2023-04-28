package com;

import java.util.Scanner;

public class Ciclos9_JCGM {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números pares entre ellos
		
		int numMayor;
		int numMenor;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese el primer número: ");
		int x = leer.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
		int y = leer.nextInt();
		
		if(x>y) {
			numMayor = x;
			numMenor = y;
		}else {
			numMayor = y;
			numMenor = x;
		}
		
		for(int i = numMenor; i <= numMayor; i++ ) {
			if(i % 2 == 0) {
				System.out.println(i+" ");
			}
			
		}

	}

}
