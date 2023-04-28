package com;

import java.util.Scanner;

public class Ejercicio3_JCGM {

	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese el primer número: ");
		double x = leer.nextDouble();
		
		System.out.println("Ingrese el segundo número: ");
		double y = leer.nextDouble();
		
		double operacion = x/y;
		
		if(y==0) {
			System.out.println("ERROR");
		}else {
			System.out.println("El resultado es: "+operacion);
		}

	}

}
