package com;

import java.util.Scanner;

public class Ejercicio13_AHP {

	public static void main(String[] args) {
		/*
		 * 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de
		 * Europa y lo reparte entre un centro de salud, un comedor de ni�os y una parte
		 * lo invierte en la bolsa de acuerdo a lo siguiente: Si el monto de la donaci�n
		 * es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de
		 * ni�os y el resto se invierte en la bolsa. Si el monto de la donaci�n es menor
		 * que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el
		 * resto se invierte en la bolsa. La instituci�n desea saber cu�nto de dinero
		 * destinar� a cada rubro anualmente
		 */

		double donacion;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la donaci�n monetaria: ");
		donacion = input.nextDouble();
		
		input.close();

		if (donacion >= 10000) {
			double salud = (donacion * 0.3);
			double ni�os = (donacion * 0.5);
			double inv = (donacion * 0.2);
			System.out.println("Se destina a salud: " + salud);
			System.out.println("Se destina al comedor de ni�os: " + ni�os);
			System.out.println("Se destina a inversi�n: " + inv);
		} else if (donacion < 10000) {
			double salud = (donacion * 0.25);
			double ni�os = (donacion * 0.6);
			double inv = (donacion * 0.15);
			System.out.println("Se destina a salud: " + salud);
			System.out.println("Se destina al comedor de ni�os: " + ni�os);
			System.out.println("Se destina a inversi�n: " + inv);
		} else {
			System.out.println("Error! Digite un monto v�lido");
		}

}

}
