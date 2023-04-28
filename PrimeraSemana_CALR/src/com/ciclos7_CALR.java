package com;

public class ciclos7_CALR {

	public static void main(String[] args) {
		//declaracion de variables
		double inversion = 700.00;
		double intereses; 
		int mes = 0;
		
		while (inversion <= 1500.00) {
			mes++;
			intereses = inversion *.02;
			System.out.println("mes: " + mes + " \12" + " intereses: " + String.format("%.2f", intereses) + "\n"
					+ "inversion: " + String.format("%.2f", inversion) + "\n" + "inversion del mes: "
					+ String.format("%.2f", (inversion + intereses)) + "\n");
			inversion += intereses;
		}

	}

}
