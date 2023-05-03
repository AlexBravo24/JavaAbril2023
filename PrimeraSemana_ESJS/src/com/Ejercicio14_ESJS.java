package com;

import java.util.Scanner;

public class Ejercicio14_ESJS {

	public static void main(String[] args) {
//		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra
		
		Scanner scanner = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Introduce horas trabajadas");
		horas = scanner.nextInt();
		
		
		
		if (horas <= 40) 
		{
			      System.out.println("Este es el monto a pagar $" + horas*16);
			    } else if(horas >= 40) 
		        { 
			    	int extra = (horas-40);
			    	int sueldo = (40*16);
					System.out.println("Este es el monto a pagar $" + ((extra*20 + sueldo)));
			    } 

	}

}
