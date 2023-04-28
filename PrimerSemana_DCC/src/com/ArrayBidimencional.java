package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		/*Array Bidimensional - Estrcutura que contiene datos de un mismo tipo, 
		 * pero en el cual pasamos de tener una sola dimension, a tener 2 o mas 
		 * Podriamos imaginarlo graficamente como una tabla*/
		
		//Declarando un array de 2 dimeciones 
		
		int [][] numeros = new int [3] [3];
		
		numeros [0][0] = 1;
		numeros [0][1] = 2;
		numeros [0][2] = 3;
		
		numeros [1][0] = 4;
		numeros [1][1] = 5;
		numeros [1][2] = 6;
		
		numeros [2][0] = 7;
		numeros [2][1] = 8;
		numeros [2][2] = 9;
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Los valores de la matriz son:");
		for(int i = 0; i < 3 ;i++) {
			for(int j = 0; j < 3 ; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
