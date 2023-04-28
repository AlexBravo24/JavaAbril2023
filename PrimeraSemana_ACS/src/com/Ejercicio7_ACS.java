package com;

import java.util.Scanner;

public class Ejercicio7_ACS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		int numerodealumnos;
		
		System.out.println("Numero de alumnos: ");
		numerodealumnos = scanner.nextInt();
		
		if(numerodealumnos >= 100) {
			System.out.println("El pago  a la agencia es de"+ 65 + "\nCada alumno debe pagar 65 euros");
			
		}else if (numerodealumnos <100 && numerodealumnos >= 50) {
			System.out.println("El pago a la agencia es de"+ 70 + "\nCada alumno debe pagar 70 euros");
			
		}else if (numerodealumnos <50 && numerodealumnos >= 30) {
			System.out.println("El pago a la agencia es de"+ 95 + "\nCada alumno debe pagar 95 euros");
			

		}else {
		      System.out.println("El costo del autobús es de 4000 euros y cada alumno "
		              + "debe pagar " + (4000/numerodealumnos) + " euros.");
			
			
	}
		

	}

}
