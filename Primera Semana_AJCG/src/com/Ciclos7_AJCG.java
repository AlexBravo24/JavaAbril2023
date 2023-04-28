package com;

public class Ciclos7_AJCG {

	public static void main(String[] args) {
		double inversion=700;
		for(int i=0; inversion<1500; i++) {
			inversion=inversion*0.02+inversion;
			if (inversion>1500) {
				System.out.println("Tendrá un total de");
				System.out.printf("%.2f", inversion);
				System.out.println(" ");
				System.out.println("En un tiempo de "+i+" meses");
			}
		}

	}

}
