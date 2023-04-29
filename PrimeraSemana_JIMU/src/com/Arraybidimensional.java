package com;

public class Arraybidimensional {

	public static void main(String[] args) {
		//Array bidimensional -  Estructura que contiene
		//datos del mismo tipo en el cual pasamos de tener
		//una sola dimensión a tener 2 o más.
		//Se puede imaginar como una tabla
		
		//Declaración de un array de dos dimensiones
		
		int [][] numeros = new int [3][3]; //el primer valor es el valor de las filas y el segundo las columnas

		numeros[0][0]=1;      //    [0][1][2]
		numeros[0][1]=2;     //[0]. [1][2][3]
		numeros[0][2]=3;
		
		numeros[1][0]=4;
		numeros[1][1]=5;     //[1]. [4][5][6]
		numeros[1][2]=6;
		
		numeros[2][0]=7;
		numeros[2][1]=8;     //[2]. [7][8][9]
		numeros[2][2]=9;
		
		//Podemos asignar valores al array bidimensional con 
		//la declaración con llaves
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz [i][j]);//muestra los valores de la primera línea
											//sube al sig que hace un salto de línea
												//vuelve, muestra otros tres, regresa por otro
												//salto y así sigue
							
			}
			System.out.println();
		}
		
	}

}
