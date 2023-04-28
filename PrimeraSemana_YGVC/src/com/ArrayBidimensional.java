package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		/*Array Bidimensional - Estructura que contiene datos de un 
		 * mismo tipo, pero en el cual pasamos
		 * de tener una sola dimension, a tener 2 o mas.
		 * Podriamos imaginario gráficamente que pasariamos a un 
		 * concepto de una "tabla"
		 * 
		 */
		
		//Declaramos un array de dos dimensiones
		
		int [][] numeros = new int [3][3];//[Filas][Columnas]
		
		numeros [0][0]=1;	   //[0][1][2]
		numeros [0][1]=2;	//0. [1][2][3]
		numeros [0][2]=3;
		
		numeros[1][0]=4;
		numeros[1][1]=5;	//[1]. [4][5][6]
		numeros[1][2]=6;
		
		numeros[2][0]=7;
		numeros[2][1]=8;	//[2]. [7][8][9]
		numeros[2][2]=9;
		
		//Podemos asignar al array Bidimensional con la declaracion con llaves
		
		int[][] matriz = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		for (int i=0;i<3;i++) {
		System.out.println();
		for (int j=0;j<3;j++) {
			System.out.print(matriz[i][j] + " "); //123
		}
		System.out.println();
		
	}
   }
}
