package com;

public class Arrays4_EHAG {

	public static void main(String[] args) {

			 
			    int[] numeros = {1, 2, 3, 4, 5};
			    int[] numerosInvertidos = new int[numeros.length];
			    
			    for (int i = 0; i < numeros.length; i++) {
			      numerosInvertidos[i] = numeros[numeros.length - 1 - i];
			    }
			    
			    System.out.println("El array original es:");
			    for (int i = 0; i < numeros.length; i++) {
			      System.out.println(numeros[i]);
			    }
			    
			    System.out.println("El array invertido es:");
			    for (int i = 0; i < numerosInvertidos.length; i++) {
			      System.out.println(numerosInvertidos[i]);
			    }
			  }
			


	}
// 

