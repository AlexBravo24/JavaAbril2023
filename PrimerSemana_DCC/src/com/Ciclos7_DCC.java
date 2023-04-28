package com;

public class Ciclos7_DCC {

	public static void main(String[] args) {
		/*--Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		dinero?--*/
		
		double capital = 1000.00;
		double interes = 0.02;
		int mes = 0;
		double interesCompuesto;
		
		while(capital <= 1500) {
			capital = capital + (capital*interes);
			mes++;
			System.out.println("El capital al mes: " + mes + ", " + "con un interes mensual del 20%" + " es de: " + capital);
		}

	}

}
