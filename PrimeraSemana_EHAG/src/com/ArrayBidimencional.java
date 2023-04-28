package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		//estructura que contiene datos de un mismo tipo
		//pero en el cual pasamos de tener
		//una solaa dimencion. a tener 2o mas.
		//podriamos imaginarlograficamente que pasariamos
		//a un concepto de una tabla
		
		//declaramos un array de dos dimenciones
		
		int[][] numeros = new int [3] [3]; //se multiplica, tres por tres para almacenarhasta
		// nueve numeros ...representanfillas y columnas
		
		numeros[0][0] =1;
		numeros[0][1] =2;
		numeros[0][2] =3;
		
		numeros[1][0] =4;
		numeros[1][1] =5;
		numeros[1][2] =6;
		
		numeros[2][0] =7;
		numeros[2][1] =8;
		numeros[2][2] =9;
		//podemos asignar valores al array bidimencional
		//con la declaracion con llave
		

		//int[] [] matriz = {{1,2,3,4,5,6,7,8,9}}; // de forma lineal
		int[] [] matriz = {{1,2,3},
			               {4,5,6},
			                {7,8,9}};
		 System.out.println("la matriz es");
		for(int i=0;i<3;i++) {
		  System.out.println();
		  for(int j=0; j<3;j++) {
			  //System.out.println(matriz[i] [j] + " ");
			  System.out.print(matriz[i] [j] + " ");
		  }
		}
		

	}

}
