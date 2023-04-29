package com;

import java.util.Scanner;

public class Ejercicio11_JIMU {

	public static void main(String[] args) {
		/*11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * 
		 */
		//Duda ¿Cómo se puede comprobar por carácteres?
		//por que me imprime el default??
		
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
	
	
	
	
		
	
		
		

	}


	}}


