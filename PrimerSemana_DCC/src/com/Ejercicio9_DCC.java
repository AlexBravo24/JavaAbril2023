package com;

import java.util.Scanner;

public class Ejercicio9_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diaSemana;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero del 1 al 7 correspondiente al dia de la semana");
		diaSemana = lector.nextInt();
		
		switch(diaSemana) {
			case 1: System.out.println("Lunes");
					break;
			
			case 2: System.out.println("Martes");
					break;
					
			case 3: System.out.println("Miercoles");
					break;
					
			case 4: System.out.println("Jueves");
					break;
					
			case 5: System.out.println("Viernes");
					break;
					
			case 6: System.out.println("Sabado");
					break;
			
			case 7: System.out.println("Domingo");
					break;
					
			default: System.out.println("Error escribe un numero del 1 al 7");
		}
	}

}
