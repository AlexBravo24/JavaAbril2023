package com;

import java.util.Scanner;

public class Ejercicio11_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int peso;
		String destino;
		int destinoContador;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el peso del paquete en KG");
		peso = lector.nextInt();
		
		if(peso <= 5 ) {
			System.out.println("Selecciona alguna opcion del 1 al 5");
			System.out.println("-------------------------");
			System.out.println("Opcion 1: America del Norte");
			System.out.println("Opcion 2: America Central");
			System.out.println("Opcion 3: America del Sur");
			System.out.println("Opcion 4: Europa");
			System.out.println("Opcion 5: Asia");
			
			destinoContador = lector.nextInt();
			
			switch(destinoContador) {
			
				case 1: System.out.println("El costo por kg es de: 24.00 euros");
				break;
				
				case 2: System.out.println("El costo por kg es de: 20.00 euros");
				break;
				
				case 3: System.out.println("El costo por kg es de: 21.00 euros");
				break;
				
				case 4: System.out.println("El costo por kg es de: 10.00 euros");
				break;
				
				case 5: System.out.println("El costo por kg es de: 18.00 euros");
				break;
				
				default: System.out.println("Error, solo existe 5 opciones");
			}
			
			
		} else {
			System.out.println("El paquete no puede ser enviado, el peso maximo es de 5 KG intenta mas adelante");
		}

	}

}
