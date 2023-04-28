package com;

import java.util.Scanner;

public class Ejercicio14_ACS {

	public static void main(String[] args) {
		
		//Un obrero necesita calcular su salario semanal, el cual se 
		//obtiene de la siguiente manera: Si trabaja 40 
		//horas o menos se le paga $16 por hora. Si trabaja más de 40
		//horas se le paga $16 por cada una de las 
		//primeras 40 horas y $20 por cada hora extra.
		
		
		Scanner scanner = new Scanner(System.in);
		
		int salario, horastrabajadas, horasextras;
		
		System.out.println("Ingrese el total de horas trabjadas: ");
		horastrabajadas = scanner.nextInt();
		salario = horastrabajadas *16;
		if(horastrabajadas>=1 && horastrabajadas<40) {
		System.out.println("El salario es de: "+salario);
		} 		
		else if(horastrabajadas>40) {
			horasextras = salario + ((horastrabajadas-40)*20);
			System.out.println("El salario es de: "+horasextras);
		}
		
		else {System.out.println("Erro, horas fuera de limite");
		}
}
}