package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//estructura que contiene datos de un mismi tipo
		//pero en 2 dimensiones
		//podriamos imaginarlo graficamente que pasariamos 
		//a un concepto de tabla
		
		//declarando un array de 2 dimensiones
		
		int[][] numeros = new int[3][3];
		
		numeros[0][0]=1; //primer corchete filas, segundo columnas
		numeros[0][1]=2;//        0  1  2
		numeros[0][2]=3;//  0     1  2  3

		numeros[1][0]=4;
		numeros[1][1]=5;
		numeros[1][2]=6;//  1     4  5  6
		
		numeros[2][0]=7;
		numeros[2][1]=8;
		numeros[2][2]=9;//  2     7  8  9
		
		// podemos declarar con llaves
		System.out.println("los valores de la matriz son:");
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
			System.out.print(matriz[i][j]+ " ");//123
		}
			System.out.println();
		}
		
	}
}
