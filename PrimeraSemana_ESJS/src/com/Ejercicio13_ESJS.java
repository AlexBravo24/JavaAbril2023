package com;

import java.util.Scanner;

public class Ejercicio13_ESJS {

	public static void main(String[] args) {
//		// Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			ni�os y el resto se invierte en la bolsa.
//			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
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
