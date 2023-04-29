package com;

import java.util.Scanner;

public class Ejercicio14_JIMU {

	public static void main(String[] args) {
		/*
		 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
primeras 40 horas y $20 por cada hora extra
		 */
       int horas;
       int sueldo;
       int sueldoExtra;
       int extras;
       int sueldoF;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Cuántas horas laboró");
		horas = entrada.nextInt();
		sueldo = 640;
		
		if (horas <= 40) {
			sueldo = horas * 16;
			System.out.println("Su salario es de "+sueldo);
			
			}else if (horas > 40) {
			extras	= horas - 40;
			sueldoExtra= extras * 20;
			sueldoF = sueldo + sueldoExtra;
			System.out.println("Su salario es de "+sueldoF);

		}

}
}