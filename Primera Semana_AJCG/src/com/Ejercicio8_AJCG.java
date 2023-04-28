package com;

import java.util.Scanner;

public class Ejercicio8_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		int dado;
		System.out.println("Ingrese el número obtenido en el dado: ");
		dado=lector.nextInt();
		lector.close();
		if (dado==1) {
			System.out.println("Cara opuesta seis");
		} else if (dado==2) {
			System.out.println("Cara opuesta cinco");
		} else if (dado==3) {
			System.out.println("Cara opuesta cuatro");
		} else if (dado==4) {
			System.out.println("Cara opuesta tres");
		} else if (dado==5) {
			System.out.println("Cara opuesta dos");
		} else if (dado==6) {
			System.out.println("Cara opuesta uno");
		} else if (dado>6 || dado<1) {
			System.out.println("Error: numero incorrecto");
		}
		

	}//FIN DE MAIN

}//FIN CODIGO
