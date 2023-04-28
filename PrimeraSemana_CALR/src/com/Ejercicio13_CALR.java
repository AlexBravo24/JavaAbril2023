package com;

import java.util.Scanner;

public class Ejercicio13_CALR {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		double donacion, comedor, salud, bolsa;
		
		
		//solicitud de datos al usuario
		System.out.println("ingrese la donacion");
		donacion = consola.nextDouble();
		
		//operaciones y muestra de resultado
		if (donacion >= 10000) {
			salud = .30 * donacion;
			comedor = .50 * donacion;
			bolsa = .20 * donacion;
			System.out.println("la cantidad donada destinada a la salud es " + salud + ", la cantidad donada destinada al comedor es " + comedor +
					", la cantidad donada destinada a la bolsa es " + bolsa);
		} else {
			salud = .25 * donacion;
			comedor = .60 * donacion;
			bolsa = .15 * donacion;
			System.out.println("la cantidad donada destinada a la salud es " + salud + ", la cantidad donada destinada al comedor es " + comedor +
					". la cantidad donada destinada a la bolsa es " + bolsa);
		}

	}

}
