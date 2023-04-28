package com;

public class ciclos6_CALR {

	public static void main(String[] args) {
		
		//declaracion de variables
		double inversion = 1000.00;
		double intereses; 
		int mes = 0;
		
		while (mes < 12) {
			mes++;
			intereses = inversion *.02;
			inversion += intereses;
			
		}
		inversion = inversion * mes;
		System.out.println("dinero obtenido al cabo de un año \n" + inversion);

	}

}
