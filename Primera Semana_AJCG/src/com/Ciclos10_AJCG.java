package com;

import java.util.Scanner;

public class Ciclos10_AJCG {

	public static void main(String[] args) {
		int sumatoria=0;
		int sumatoria2=0;
		for (int i=0; i<20; i++) {
			Scanner lector=new Scanner(System.in);
			System.out.println("Ingrese un numero:");
			int num1;
			num1=lector.nextInt();
			if (num1>0) {
				System.out.println("El numero es positivo");
				sumatoria=sumatoria+num1;
				System.out.println(sumatoria+" es la suma de los positivos");
			} else {
				System.out.println("El numero es negativo");
			}
			if (num1%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
				sumatoria2=sumatoria2+num1;
				System.out.println(sumatoria2+ " es la suma de los impares");
			}
			
		
		}

	}

}
