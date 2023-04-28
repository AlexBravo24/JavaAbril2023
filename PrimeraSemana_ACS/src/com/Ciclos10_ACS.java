package com;

import java.util.Scanner;

public class Ciclos10_ACS {

	public static void main(String[] args) {

		// Programa que lea 20 números e indique si son positivos
		// o negativos y pares o impares y además muestre la
		// sumatoria de los positivos y sumatoria de los impares.

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int n;
		double sumaimpar = 0;
		double sumpositivos = 0;

		System.out.println("Ingrese los numeros que desee: ");
		while (contador < 20) {
			n = sc.nextInt(); // lee los numeros
			if (n < 0) {
				System.out.println("Numero negativo");
			} else {
				System.out.println("Numero positivo");
				sumpositivos = sumpositivos + n;
			}
			if (n % 2 == 0) {
				System.out.println("Numero es par");
			} else {
				System.out.println("Numero es impar");
				sumaimpar = sumaimpar + n;
			}
			contador++;
		}
		System.out.println("La suma de los numeros positivos es: " + sumpositivos);
		System.out.println("La suma de los numeros impares es: " + sumaimpar);

	}

}
