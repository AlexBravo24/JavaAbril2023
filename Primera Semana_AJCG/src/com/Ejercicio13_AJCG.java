package com;

import java.util.Scanner;

public class Ejercicio13_AJCG {

	public static void main(String[] args) {
		double dinero;
		System.out.println("Ingrese la cantidad de dinero:");
		Scanner lector=new Scanner(System.in);
		dinero=lector.nextDouble();
		lector.close();
		if (dinero>=10000) {
			double salud= dinero*0.3;
			double comedor= dinero*0.5;
			double inversion= dinero-salud-comedor;
			System.out.println("Para el centro de salud es $"+ salud);
			System.out.println("Para el comedor de niños es $"+ comedor);
			System.out.println("Para invertir en bolsa es $"+ inversion);
			
		} else {
			double salud= dinero*0.25;
			double comedor= dinero*0.6;
			double inversion= dinero-salud-comedor;
			System.out.println("Para el centro de salud es $"+ salud);
			System.out.println("Para el comedor de niños es $"+ comedor);
			System.out.println("Para invertir en bolsa es $"+ inversion);
			
		}

	}

}
