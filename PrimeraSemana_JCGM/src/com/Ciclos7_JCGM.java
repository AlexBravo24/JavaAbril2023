package com;

public class Ciclos7_JCGM {

	public static void main(String[] args) {
		
//		Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
//		dinero? 
		
		
		double capital = 700.0;
		int meses = 0;
		
		while(capital < 1500) {
			double interes = capital * 0.02;
			capital += interes;
			System.out.println(capital);
			meses++;
		}
		System.out.println("El capital pasa los $1500 después de "+meses+" meses");
		


	}

}
