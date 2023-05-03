package com;

import java.util.Scanner;

public class Ejercicio13_ESJS {

	public static void main(String[] args) {
//		// Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			niños y el resto se invierte en la bolsa.
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		Scanner scanner = new Scanner(System.in);
		
		double donacion;
		
		System.out.println("Introduce donacion");
		donacion = scanner.nextDouble();
		
		
		if (donacion >= 10000) 
		{
			      System.out.println("Este es el monto que se destina a salud $" + donacion*.30 + ", "
			          + " este es el monto que se destina a comedor $" + donacion*.50 + " y"
			          + " este es el monto que se destina a la bolsa $" + donacion*.20 );
			    } else if(donacion < 10000) 
		        {
			    	System.out.println("Este es el monto que se destina a salud $" + donacion*.25 + ", "
					          + " este es el monto que se destina a comedor $" + donacion*.60 + " y"
					          + " este es el monto que se destina a la bolsa $" + donacion*.15 );
			    } 
				
		
	}

}
