package com;

import java.util.Scanner;

public class Ciclos8_JCGM {

	public static void main(String[] args) {
		
		// Programa Java que lea dos números y muestre los números desde el menor hasta el
		//mayor
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
			System.out.println(i+" ");
		}

	}

}
