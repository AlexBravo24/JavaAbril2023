package com;

public class Ciclos6_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
			mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
			todo el dinero lo reinvierte?
		 */
		
		double inversion=1000;
		double interes=0.02;
		double multi;
		double total=0;
		int mes=0;
		while(mes<12) {
			mes++;
			multi=inversion*interes;
			total=multi+inversion;
			inversion=total;
		}
		System.out.println("la cantidad de dinero que tendra: "+total);
	}

}
