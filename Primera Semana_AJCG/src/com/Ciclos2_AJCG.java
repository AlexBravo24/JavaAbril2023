package com;

import java.util.Scanner;

public class Ciclos2_AJCG {

	public static void main(String[] args) {
		System.out.println("Ingrese el n�mero a multipicar: ");
		Scanner entrada= new Scanner (System.in);
		int num;
		num= entrada.nextInt();
		System.out.println("Ingrese el n�mero de iteraciones: ");
		Scanner entrada2= new Scanner (System.in);
		int iteraciones;
		iteraciones= entrada2.nextInt();
		
		for (int x=1; x<=iteraciones; x++ ) {
			int multiplicacion= x*num;
			System.out.println("La iteraci�n " + x + " es igual a " + multiplicacion);
		}

	}//FIN DE MAIN

}//FIN DE CODIGO
