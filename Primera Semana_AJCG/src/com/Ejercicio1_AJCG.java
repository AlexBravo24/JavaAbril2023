package com;

import java.util.Scanner;

public class Ejercicio1_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		int a;
		System.out.println("Introduce el n�mero a: ");
		a=lector.nextInt();
		Scanner lector2= new Scanner (System.in); 
		int b;
		System.out.println("Introduce el n�mero b: ");
		b=lector2.nextInt(); 
		
		if (a<b) { 
			System.out.println("El n�mero " + b + " es mayor que " + a);
		} else if (a>b) {
			System.out.println("El n�mero " + a + " es mayor que " + b);
		} else if (a==b) {
			System.out.println("Los numeros " + a + " y " +  b + " son iguales");
		}
	}//FIN DE STRING

}//FIN DE CODIGO
