package com;

public class Ciclos6_JIMU {

	public static void main(String[] args) {
		/*
		 * 6.- Una persona desea invertir $1000.00 en un banco, 
		 * el cual le otorga un 2% de inter�s 
			mensual. �Cu�l ser� la cantidad de dinero que esta 
			persona tendr� al cabo de un a�o si 
			todo el dinero lo reinvierte?
		 */
		int inversion=1000;
		double ganancia=1000;
		double nuevo;
		
		for (int i=1; i<=12;i++) {
			ganancia=(ganancia*0.02) + (ganancia);

		//nuevo = inversion + ganancia;
		
			System.out.println(ganancia);
		}
	}

}
