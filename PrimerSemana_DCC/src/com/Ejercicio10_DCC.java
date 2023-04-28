package com;

import java.util.Scanner;

public class Ejercicio10_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diasMes;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero del 1 al 12 correspondiente a los meses del año");
		diasMes = lector.nextInt();
		
		switch(diasMes) {
			case 1: System.out.println("Enero tiene 31 dias");
					break;
			
			case 2: System.out.println("Febrero tiene 28 dias");
					break;
					
			case 3: System.out.println("Marzo tiene 31 dias");
					break;
					
			case 4: System.out.println("Abril tiene 30 dias");
					break;
					
			case 5: System.out.println("Mayo tiene 31 dias");
					break;
					
			case 6: System.out.println("Junio tiene 30 dias");
					break;
			
			case 7: System.out.println("Julio tiene 31 dias");
					break;
					
			case 8: System.out.println("Agosto tiene 31 dias");
					break;
			
			case 9: System.out.println("Septiembre tiene 30 dias");
					break;
			
			case 10: System.out.println("Octubre tiene 31 dias");
					break;
			
			case 11: System.out.println("Noviembre tiene 30 dias");
					break;
	
			case 12: System.out.println("Diciembre tiene 31 dias");
					break;
					
			default: System.out.println("Error escribe un numero del 1 al 12");

		}

	}
}
