package com;

public class Ciclos6_DCC {

	public static void main(String[] args) {
		/*--Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		todo el dinero lo reinvierte?--*/
		
		double capital = 1000.00;
		double interes = 0.02;
		int mes = 0;
		double interesCompuesto;
		
		while(mes < 12) {
			capital = capital + (capital*interes);
			mes++;
			System.out.println("El capital al mes: " + mes + ", " + "con un interes mensual del 20%" + " es de: " + capital);
		}

	}

}
