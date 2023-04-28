package com;

import java.util.Scanner;

public class Ejercicio14_DCC {

	public static void main(String[] args) {
		/*--Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
			horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
			primeras 40 horas y $20 por cada hora extra.--*/
		
		double horasTrabajadas;
		String nombre;
		double precioPorHora;
		double sueldoBase;
		double sueldoExtra;
		double sueldoTotal = 0;
		double horasExtras;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del empleado");
		nombre = lector.next();
		
		System.out.println("Introduce las horas trabajadas");
		horasTrabajadas = lector.nextDouble();
		
		if (horasTrabajadas >= 40) {
			horasExtras = horasTrabajadas - 40;
			sueldoBase = 40 * 16;
			sueldoExtra = horasExtras * 20;
			sueldoTotal = sueldoBase + sueldoExtra;
			
		} else {
			sueldoTotal = horasTrabajadas * 16;
		}
		
		System.out.println("El sueldo total del trabajador: " + nombre + " es: " + sueldoTotal + "$");

	}

}
