package com;

public class Array4_VMGF {

	public static void main(String[] args) {
		//Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto 
		//pero con los valores invertidos, es decir, que el segundo array deberá 
		//tener los valores {5,4,3,2,1}.
		
		int[] arreglo = {1, 2, 3, 4, 5};
		int[] numeros = new int [arreglo.length];
		
		for(int i=0; i<arreglo.length; i++) {
			numeros [i] =arreglo[arreglo.length -1 -i];
		}
		System.out.println("El array es:");
		for (int i=0; i<arreglo.length; i++);{
		System.out.println(arreglo[i]);
		}

		System.out.println("El array invertido es:");
		for (int i=0; i<numeros.length; i++);{
		System.out.println(numeros[i]);
	}
	}
}

	



