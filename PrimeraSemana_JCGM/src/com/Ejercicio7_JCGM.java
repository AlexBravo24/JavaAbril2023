package com;

import java.util.Scanner;

public class Ejercicio7_JCGM {

	public static void main(String[] args) {
		
//		El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
//		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
//		cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
//		pagar cada alumno por el viaje.
		
		int pago; int costoTotal;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Número de alumnos: ");
		int alumnos = leer.nextInt();
		
		if(alumnos >=100) {
			pago=65;
			costoTotal= alumnos * pago;
			System.out.println("Cada alumno pagará: "+pago + " euros");
			System.out.println("El costo total será: "+costoTotal+" euros");
		}else if (alumnos >=50 && alumnos<=99) {
			pago=70;
			costoTotal=alumnos*pago;
			System.out.println("Cada alumno pagará: "+pago + " euros");
			System.out.println("El costo total será: "+costoTotal+" euros");			
		}else if(alumnos >=30 && alumnos <=49) {
			pago=95;
			costoTotal=alumnos*pago;
			System.out.println("Cada alumno pagará: "+pago + " euros");
			System.out.println("El costo total será: "+costoTotal+" euros");
		}else if(alumnos >0 && alumnos <30) {
			costoTotal= 4000/alumnos;
			System.out.println("Cada alumno pagará: "+costoTotal + " euros");
			System.out.println("El costo total será 4000 euros");
		
		}else {
			System.out.println("Número invalido");
			return;
		}

	}

}
