package com;

public class Ciclos7_JIMU {

	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00 en un banco, 
		 * el cual le otorga un 2% de inter�s 
			mensual. �En cu�ntos meses tendr� m�s de $1500, 
			si reinvierte cada mes todo su dinero?
		 */
		double ganancia=700;
		//double nuevo;
		int contador=0; 
		while (ganancia <=1500) {
			
			ganancia=(ganancia*0.02) + (ganancia);
			contador++;
		
			//System.out.println(ganancia);
		}
		System.out.println("El n�mero de meses es: "+contador);
	}

}
