package com;

public class Array2_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* 2. Crea un array de números de 100 posiciones, que contendrá los números del
			1 al 100. Obtén la suma de todos ellos y la media.
		 */
		
		int [] numeros=new int[100];
		double suma=0;
		double media=0;
		
		for(int i=0;i<100;i++) {
			
			numeros[i]=i+1;
			suma=suma+numeros[i];
		}
		
		media=suma/numeros.length;
		
		System.out.println("la suma es: "+suma);
		System.out.println("la media es "+media);
	}

}
