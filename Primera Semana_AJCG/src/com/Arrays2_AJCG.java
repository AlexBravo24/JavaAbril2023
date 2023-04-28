package com;

public class Arrays2_AJCG {

	public static void main(String[] args) {
		int [] numeros= new int [101];
		double suma=0;
		for (int i=1; i<=100; i++) {
			numeros[i]=i;
			suma=suma+i;
			double media=suma/i;
			if (i==100) {
				System.out.println("El resultado de suma es "+ suma);
				System.out.println("El resultado de media es "+media);
			}
			
		}

	}

}
