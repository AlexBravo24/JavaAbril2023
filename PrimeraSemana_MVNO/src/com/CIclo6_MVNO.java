package com;

public class CIclo6_MVNO {
	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
todo el dinero lo reinvierte?*/
		double inversion=1000;
		
		for(int i =0; i<12; i++) {
			inversion= inversion+(inversion*0.02);	
		}
		System.out.println("La cantidad a ganar en un a�o es: " + inversion);
	}
}
