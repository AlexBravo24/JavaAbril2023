package com;

import java.util.Scanner;

public class Ejercicio12_CALR {
	static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {
		// atributos de la clase principal
		double IMC;
		double peso;
		double estatura;

		// el usuario ingresa sus datos
		System.out.println("Ingrese su peso.");
		peso = consola.nextDouble();

		System.out.println("Ingrese su estatura");
		estatura = consola.nextDouble();

		IMC = peso / (estatura * estatura);

		if (IMC < 16) {
			System.out.println("Ingreso hospital");
		} else if (IMC >= 16 && IMC <= 17) {
			System.out.println("Infrapeso");
		} else if (IMC >= 17 && IMC <= 18) {
			System.out.println("Bajo peso");
		} else if (IMC >= 18 && IMC <= 25) {
			System.out.println("peso normal");
		} else if (IMC >= 25 && IMC <= 30) {
			System.out.println("sobrepeso (obesidad grado 1)");
		} else if (IMC >= 30 && IMC <= 35) {
			System.out.println("sobrepeso crónico(obesidad grado 2)");
		} else if (IMC >= 35 && IMC <= 40) {
			System.out.println("obesidad premórbida(obesidad grado 3)");
		} else if (IMC > 40) {
			System.out.println("obesidad mórbida(obesidad grado 4)");
		}

	}

}
