package com;

import java.util.Scanner;

public class Ciclos10_JCGM {

	public static void main(String[] args) {
		
//		Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
//		impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares
		
		int positivo= 0;
		int negativo;
		int par;
		int impar = 0;
		int sumaPositivos=0;
		int sumaImpares=0;
		
		Scanner leer = new Scanner (System.in);
		
		for(int i=1; i<=20; i++) {
			System.out.println("Ingrese su valor n�mero "+i+ ": ");
			int x = leer.nextInt();
			
			if(x > 0) {
				positivo =x;
				sumaPositivos += x;
				System.out.println("El n�mero: "+positivo+ " es positivo.");
			}else {
				negativo = x;
				System.out.println("El n�mero: "+negativo+ " es negativo.");
			}
			
			if (x % 2 == 0) {
				par = x;
				System.out.println("El n�mero: "+par+ " es par.");
			}else {
				impar = x;
				sumaImpares += x;
				System.out.println("El n�mero: "+impar+ " es impar.");
			}
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("La sumatoria de los positivos es: "+sumaPositivos);
		System.out.println("La sumatoria de los impares es: "+sumaImpares);
	}
		

}


