package com;

public class Ciclos6_AHP {

	public static void main(String[] args) {
		/*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		todo el dinero lo reinvierte?
*/
			double capital = 1000 ;
			double interes = 0.02 ;
			int plazo = 12 ;
			
			double despues = capital;
			for (int mes = 1; mes <= plazo ; mes++) {
				despues += despues * interes ;
			}
			System.out.println("Despues de un a�o, la cantidad total ser� : "+despues);
			
	}

}
