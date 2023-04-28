package com;

import java.util.Scanner;

public class Ejercicio3_JABR {

	public static void main(String[] args) {
		
		/* 3. Crea un programa que pida al usuario dos números 
		 * y muestre el resultado de su división.
		 * Si el segundo número es 0, 
		 * debe mostrar un mensaje de error.
		 * 
		 */
		
		double num1;
		double num2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextDouble();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextDouble();
		entrada.close();
		
		double resultado = num1/num2;
		
		if (num2 == 0) {
			System.out.println("Error de división");
		}else {
			System.out.println("El resultado de la division del primer numero"
					+ " entre el segundo es: " + resultado);
		}

	}

}
