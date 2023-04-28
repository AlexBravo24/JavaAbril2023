package com;

public class ArrayBidi_MVNO {
	public static void main(String[] args) {
		/*
		 * Array bidimensional - estructura que contiene datos de un mismo
		 * tipo, pero en el cual pasamos de tener una sola dimension,  a tener
		 * 2 o mas.
		 * podriamos iamginarlo graficamente que pasariamos a un concepto de una tabla*/
		
		int [] [] numeros = new int [3] [3]; // filas , columnas
		
		numeros [0] [0] = 1;     // [0][1][2]
		numeros [0] [1] = 2;    //
		numeros [0] [2] = 3;
		
		numeros [1] [0] = 4;
		numeros [1] [1] = 5;
		numeros [1] [2] = 6;
		
		numeros [2] [0] = 7;
		numeros [2] [1] = 8;
		numeros [2] [2] = 9;
		
		//podemos aignar valores al array bidimensional con la declaracion de llaves
		int [] [] matriz = {{1,2,3},
				           {4,5,6},
				           {7,8,9}};
		System.out.println("los valores contenidos son:");
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
