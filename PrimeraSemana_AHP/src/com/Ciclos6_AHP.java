package com;

public class Ciclos6_AHP {

	public static void main(String[] args) {
		/*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		todo el dinero lo reinvierte?
*/
			double capital = 1000 ;
			double interes = 0.02 ;
			int plazo = 12 ;
			
			double despues = capital;
			for (int mes = 1; mes <= plazo ; mes++) {
				despues += despues * interes ;
			}
			System.out.println("Despues de un año, la cantidad total será : "+despues);
			
	}

}
