package com;

import java.util.Scanner;

public class Ejercicio3_JCGM {

	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
		//segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese el primer n�mero: ");
		double x = leer.nextDouble();
		
		System.out.println("Ingrese el segundo n�mero: ");
		double y = leer.nextDouble();
		
		double operacion = x/y;
		
		if(y==0) {
			System.out.println("ERROR");
		}else {
			System.out.println("El resultado es: "+operacion);
		}

	}

}
