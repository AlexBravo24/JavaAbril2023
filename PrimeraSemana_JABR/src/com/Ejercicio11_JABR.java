package com;

import java.util.Scanner;

public class Ejercicio11_JABR {

	public static void main(String[] args) {
	
		int destino = 0;
		double pesoPaquete;
		double costo;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuál es el peso del paquete?");
		pesoPaquete = entrada.nextInt();
		
		if (pesoPaquete>5) {
			System.out.println("No es posible hacer el envío");
		
		}else {
		System.out.println("¿A qué destino se dirigirá el paquete?");
		System.out.println("1. América del Norte");
		System.out.println("2. América Central");
		System.out.println("3. América del Sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");

	destino = entrada.nextInt();
	
		}
		
		switch (destino) {
		case 0: 
			System.out.println("No puede realizarse la entrega");
			break;
		case 1: 
			costo= pesoPaquete * 24000;
			System.out.println("Su pago será de "+costo);

			break;
		case 2: 
			costo= pesoPaquete *20000;
			System.out.println("Su pago será de "+costo);

			break;
		case 3: 
			costo= pesoPaquete *21000;
			System.out.println("Su pago será de "+costo);
			break;
		case 4: 
			costo= pesoPaquete *10000;
			System.out.println("Su pago será de "+costo);
			break;
		case 5: 
			costo= pesoPaquete *18000;
			System.out.println("Su pago será de "+costo);
			break;
		default:
		System.out.println("Error de selección");
		break;
	

	}


	}

	}


