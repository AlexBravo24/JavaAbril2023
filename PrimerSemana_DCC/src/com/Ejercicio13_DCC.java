package com;

import java.util.Scanner;

public class Ejercicio13_DCC {

	public static void main(String[] args) {
		/*--Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
			centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
			y el resto se invierte en la bolsa.
			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
			ni�os y el resto se invierte en la bolsa.
			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.--*/
		
		double montoDonacion;
		double montoCentroSalud = 0;
		double montoComedor = 0;
		double montoInversion = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad donacion");
		montoDonacion = lector.nextDouble();
		
		if(montoDonacion >= 10000) {
			montoCentroSalud = montoDonacion * 0.3;
			montoComedor = montoDonacion * 0.5;
			montoInversion = montoDonacion * 0.2;
		} else {
			montoCentroSalud = montoDonacion * 0.25;
			montoComedor = montoDonacion * 0.6;
			montoInversion = montoDonacion * 0.15;
		}
		
		System.out.println("El monto para el centro de salud es: " + montoCentroSalud);
		System.out.println("El monto para el comedor de ni�os es: " + montoComedor);
		System.out.println("El monto para invertir en la bolsa es: " + montoInversion);
		

	}

}
