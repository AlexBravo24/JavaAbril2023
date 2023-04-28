package com;

import java.util.Scanner;

public class Ejercicio13_AHP {

	public static void main(String[] args) {
		/*
		 * 13. Una institución benéfica recibe anualmente una donación proveniente de
		 * Europa y lo reparte entre un centro de salud, un comedor de niños y una parte
		 * lo invierte en la bolsa de acuerdo a lo siguiente: Si el monto de la donación
		 * es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de
		 * niños y el resto se invierte en la bolsa. Si el monto de la donación es menor
		 * que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el
		 * resto se invierte en la bolsa. La institución desea saber cuánto de dinero
		 * destinará a cada rubro anualmente
		 */

		double donacion;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la donación monetaria: ");
		donacion = input.nextDouble();
		
		input.close();

		if (donacion >= 10000) {
			double salud = (donacion * 0.3);
			double niños = (donacion * 0.5);
			double inv = (donacion * 0.2);
			System.out.println("Se destina a salud: " + salud);
			System.out.println("Se destina al comedor de niños: " + niños);
			System.out.println("Se destina a inversión: " + inv);
		} else if (donacion < 10000) {
			double salud = (donacion * 0.25);
			double niños = (donacion * 0.6);
			double inv = (donacion * 0.15);
			System.out.println("Se destina a salud: " + salud);
			System.out.println("Se destina al comedor de niños: " + niños);
			System.out.println("Se destina a inversión: " + inv);
		} else {
			System.out.println("Error! Digite un monto válido");
		}

}

}
