package com;

import java.util.Scanner;

public class Ejercicio3_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("ingresa dos numeros");
		double num1 = escaner.nextDouble();
		double num2 = escaner.nextDouble();
		 
		double resultadoDivision = num1 / num2;
		System.out.println("El resultado de la division es " + resultadoDivision);

	}

}
