package com;

import java.util.Scanner;

public class Ejercicio11_JIMU {

	public static void main(String[] args) {
		/*11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * 
		 */
		//Duda �C�mo se puede comprobar por car�cteres?
		//por que me imprime el default??
		
		int destino = 0;
		double pesoPaquete;
		double costo;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("�Cu�l es el peso del paquete?");
		pesoPaquete = entrada.nextInt();
		
		if (pesoPaquete>5) {
			System.out.println("No es posible hacer el env�o");
		
		}else {
		System.out.println("�A qu� destino se dirigir� el paquete?");
		System.out.println("1. Am�rica del Norte");
		System.out.println("2. Am�rica Central");
		System.out.println("3. Am�rica del Sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");

	destino = entrada.nextInt();
		}
		
		switch (destino) {
		case 1: 
			costo= pesoPaquete * 24000;
			System.out.println("Su pago ser� de "+costo);

			break;
		case 2: 
			costo= pesoPaquete *20000;
			System.out.println("Su pago ser� de "+costo);

			break;
		case 3: 
			costo= pesoPaquete *21000;
			System.out.println("Su pago ser� de "+costo);
			break;
		case 4: 
			costo= pesoPaquete *10000;
			System.out.println("Su pago ser� de "+costo);
			break;
		case 5: 
			costo= pesoPaquete *18000;
			System.out.println("Su pago ser� de "+costo);
			break;
	default:
	System.out.println("Error de selecci�n");
	
	
	
	
		
	
		
		

	}


	}}


