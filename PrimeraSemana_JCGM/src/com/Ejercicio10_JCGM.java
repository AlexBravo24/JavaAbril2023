package com;

import java.util.Scanner;

public class Ejercicio10_JCGM {

	public static void main(String[] args) {
		
//		.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
//		mes correspondiente.
		
		int dias;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el número de mes: ");
		int mes = leer.nextInt();
		
		switch (mes) {
		case 1:
			dias=31;
			System.out.println("El número de días del mes es: "+dias);
			
			break;
			
		case 2:
			System.out.println("¿Es año bisisesto? (S/N): ");
			String cadena = leer.nextLine();
			
			if (cadena.equalsIgnoreCase("S")) {
				dias=29;
				System.out.println("El número de días del mes es: "+dias);
			}else if (cadena.equalsIgnoreCase("N")) {
				dias=28;
				System.out.println("El número de días del mes es: ");
			}
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 6:
			
			break;
			
		case 7:
			
			break;
			
		case 8:
			
			break;
			
		case 9:
			
			break;
			
		case 10:
			
			break;
			
		case 11:
			
			break;
			
		case 12:
			
			break;
			

		default:
			break;
		}
		

	}

}
