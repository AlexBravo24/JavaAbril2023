package com;

public class Arrays4_JIMU {

	public static void main(String[] args) {
		/*
		 * 4. Dado un array de n�meros de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
los valores invertidos, es decir, que el segundo array deber� tener los valores 
{5,4,3,2,1}
		 */
		int [] arreglo = {1,2,3,4,5};
		int [] numeros = new int [5];
		int contador=0;
		
		for (int i=4; i>=0; i--) {
			//System.out.print(arreglo [i]);

			numeros [contador] = arreglo [i];
			contador++;
			
		}
		for (int i=0; i<numeros.length;i++) {
//           
	System.out.print(numeros[i]);
}
	
	}
}
