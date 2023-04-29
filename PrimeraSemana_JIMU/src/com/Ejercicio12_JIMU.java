package com;

import java.util.Scanner;

public class Ejercicio12_JIMU {

	public static void main(String[] args) {
		/*
		 * 12.Construir un programa que calcule el índice 
		 * de masa corporal de una persona (IMC = peso [kg] / altura2 
[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

		 */
		double peso;
		double estatura;
		double indiceMasa;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el peso");
		peso = entrada.nextDouble();
		System.out.println("Introduzca la altura");
		estatura = entrada.nextDouble();
		
		indiceMasa= peso/estatura;
		System.out.println("Su índice de Masa es " +indiceMasa);

		if (indiceMasa < 16) {
			System.out.println("Su estado es crítico");
			
		}else if 
			(indiceMasa >=16 && indiceMasa <=17) {
			System.out.println("Se encuentra en infrapeso");
			
		}else if 
			(indiceMasa == 18) {
			System.out.println("Se encuentra en bajo peso");
			
		}else if 
			(indiceMasa >18 && indiceMasa <25) {
			System.out.println("Se peso es normal");
		
		}else if 
			(indiceMasa >25 && indiceMasa <30) {
			System.out.println("Tiene obesidad grado 1");
		
		}else if 
			(indiceMasa >30 && indiceMasa <35) {
			System.out.println("Tiene obesidad grado 2");
		
		}else if 
			(indiceMasa >35 && indiceMasa <40) {
			System.out.println("Tiene obesidad grado 3");
		
		}else if 
			(indiceMasa >40) {
			System.out.println("Tiene obesidad grado 4");
		}
	}

}
