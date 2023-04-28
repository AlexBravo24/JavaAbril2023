package com;

import java.util.Scanner;

public class Ejercicio9_AJCG {

	public static void main(String[] args) {
		System.out.println("Introduce un numero del 1 al 7: ");
		Scanner lector= new Scanner (System.in);
		int dia;
		dia=lector.nextInt();
		lector.close();
		
		switch (dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("Error");
		
		} 

	}//FIN DE MAIN

}//FIN CODIGO
