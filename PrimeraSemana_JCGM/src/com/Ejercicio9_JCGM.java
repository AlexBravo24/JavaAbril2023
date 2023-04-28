package com;

import java.util.Scanner;

public class Ejercicio9_JCGM {

	public static void main(String[] args) {
		
//		Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
//		introducimos otro número nos da un error
		
		String cadena;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el día: ");
		int dia = leer.nextInt();
		
		switch (dia) {
		case 1:
			cadena="Lunes";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 2:
			cadena="Martes";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 3:
			cadena="Miercoles";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 4:
			cadena="Jueves";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 5:
			cadena="Viernes";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 6:
			cadena="Sábado";
			System.out.println("El día es: "+cadena);		
			break;
			
		case 7:
			cadena="Domingo";
			System.out.println("El día es: "+cadena);		
			break;

		default:
			System.out.println("ERROR");
			break;
		}

	}

}
