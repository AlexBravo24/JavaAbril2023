package com;

public class Ciclos7_ESJS {

	public static void main(String[] args) {
//		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
//		mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
//		dinero?
		
		double inversion=700;
		double interes=0.02;
		double mult;
		double total=0;
		int mes=0;
		
		while(total<1500) 
		{
			mes++;
			mult=inversion*interes;
			total=mult+inversion;
			inversion=total;
		}
		System.out.println("La cantidad de dinero que tendra: "+total+" y meses en que lo obtuvo fue de: "+mes+" meses");

	}

}
