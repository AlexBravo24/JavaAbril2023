package com;

import java.util.Scanner;

public class Ejercicio14_AJCG {

	public static void main(String[] args) {
		int horas;
		System.out.println("Ingrese sus horas de trabajo a la semana: ");
		Scanner lector=new Scanner (System.in);
		horas=lector.nextInt();
		lector.close();
		if (horas<=40) {
			int salario= 16*horas;
			System.out.println("Su salario sería de $"+salario);
		} else if (horas>40) {
			int horasextras=horas-40;
			int pagoextras= horasextras*20;
			int salario= (16*40)+pagoextras;
			System.out.println("Su salario sería de $"+salario);
		}
		
	}

}
