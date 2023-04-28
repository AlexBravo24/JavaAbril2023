package com;

import java.util.Scanner;

public class Ejercicio13_DCC {

	public static void main(String[] args) {
		/*--Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
			centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
			y el resto se invierte en la bolsa.
			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
			niños y el resto se invierte en la bolsa.
			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.--*/
		
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
		System.out.println("El monto para el comedor de niños es: " + montoComedor);
		System.out.println("El monto para invertir en la bolsa es: " + montoInversion);
		

	}

}
