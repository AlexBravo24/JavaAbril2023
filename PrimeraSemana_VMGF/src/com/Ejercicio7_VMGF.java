package com;

import java.util.Scanner;

public class Ejercicio7_VMGF {

	public static void main(String[] args) {
		//El director de una escuela está organizando un viaje de estudios
		
		
		int pagobus;
		int alumnos;
		int alumnosmax;
		
		Scanner lector1 = new Scanner(System.in);
		System.out.println("cuantos alumnos viajan?");
		alumnos = lector1.nextInt();
		if (alumnos>=100) {
			System.out.println("El precio por alumno es de 65 euros");
			alumnosmax = alumnos*65;
			System.out.println("El monto por autobus es de " + alumnosmax  + " euros ");
		}else if ((alumnos>=50)&&(alumnos>=99)) {
			System.out.println("El costo por alumno es de 70 euros");
			alumnosmax =alumnos*70;
			System.out.println("El monto es de" + alumnosmax);
		}else if ((alumnos>=30)&&(alumnos>=49)) {
			System.out.println("El costo por alumno es de 95 euros");
			alumnosmax =alumnos*95;
			System.out.println("El monto es de autobus es de " +  alumnosmax);
		}else if (alumnos<=30) {
			alumnosmax = 4000/alumnos;
			System.out.println("El costo del autobus es 4000 euros");
			System.out.println("El pago por alumno es ");
			System.out.println("!%.2f" +  alumnosmax );
		
		
			
			
			
		}
		
		
		
		

	}

}
