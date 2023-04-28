package com;

public class Ciclos7_AHP {

	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada
		 * mes todo su dinero?
		 */
		double capital = 700;
		double interes = 0.02;
		double objetivo = capital;
		int meses = 0;

		while (objetivo < 1500.00) {
			objetivo += objetivo * interes;
			capital = objetivo ;
			meses ++;
		}
		System.out.println("Despues de: \"" + meses + "\" meses se obtienen $1500");

	}

}
