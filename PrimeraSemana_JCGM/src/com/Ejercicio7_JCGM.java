package com;

import java.util.Scanner;

public class Ejercicio7_JCGM {

	public static void main(String[] args) {
		
//		El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
//		pagar cada alumno por el viaje.
		
		int pago; int costoTotal;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("N�mero de alumnos: ");
		int alumnos = leer.nextInt();
		
		if(alumnos >=100) {
			pago=65;
			costoTotal= alumnos * pago;
			System.out.println("Cada alumno pagar�: "+pago + " euros");
			System.out.println("El costo total ser�: "+costoTotal+" euros");
		}else if (alumnos >=50 && alumnos<=99) {
			pago=70;
			costoTotal=alumnos*pago;
			System.out.println("Cada alumno pagar�: "+pago + " euros");
			System.out.println("El costo total ser�: "+costoTotal+" euros");			
		}else if(alumnos >=30 && alumnos <=49) {
			pago=95;
			costoTotal=alumnos*pago;
			System.out.println("Cada alumno pagar�: "+pago + " euros");
			System.out.println("El costo total ser�: "+costoTotal+" euros");
		}else if(alumnos >0 && alumnos <30) {
			costoTotal= 4000/alumnos;
			System.out.println("Cada alumno pagar�: "+costoTotal + " euros");
			System.out.println("El costo total ser� 4000 euros");
		
		}else {
			System.out.println("N�mero invalido");
			return;
		}

	}

}