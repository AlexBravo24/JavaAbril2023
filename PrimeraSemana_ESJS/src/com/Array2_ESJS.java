package com;

public class Array2_ESJS {

	public static void main(String[] args) {
//		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//		1 al 100. Obt�n la suma de todos ellos y la media.


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
