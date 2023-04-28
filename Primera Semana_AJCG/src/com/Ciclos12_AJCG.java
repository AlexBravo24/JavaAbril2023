package com;

import java.util.Scanner;

public class Ciclos12_AJCG {

	public static void main(String[] args) {
		double sumaedad=0; 
		double promedio=0;
		for (int i=1; promedio<25; i++) {
			Scanner lector=new Scanner (System.in);
			System.out.println("Ingrese su edad");
			int edad;
			edad=lector.nextInt();
			sumaedad=sumaedad+edad;
			promedio=sumaedad/i;
			if (promedio>25) {
				System.out.println("El promedio es igual a "+ promedio);
			}
		}

	}

}
