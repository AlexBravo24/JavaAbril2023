package com;

public class Array {

	public static void main(String[] args) {
		// array  
		
		//estructura de datos o coleccion que almacenan un
		//tipo de datos en comun
		// se caracterizan por declarar, tamaño, longitud
		//y no puede cambiar en tiempo de ejecucion
		
//declarar un array y su tamaño
		
		int[] numeros = new int [5];//array de numeros enteros con tamaño declarado
		
		char[] letras = new char [5];// array de caracteres
		
		// se puede almacenar en cada una de las posiciones
		
		numeros[0]=100;
		numeros[1]=101;
		numeros[2]=102;
		numeros[3]=103;
		numeros[4]=104;
		//darle salida al valor contenido en cierta posicion 
		
		System.out.println(numeros[4]);
		
		// otra manera de delarar
		
		String[] nombres = {"ivan", "carlos","yocelin", "jorge"};
		 System.out.println(nombres[3]);
		
	//ciclo impresion
		
//		for(int i=0;i<numeros.length;i++) {
//			System.out.println(numeros[i]);
//		}
		
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}		
		
		letras [0]='A';
		letras [1]='l';
		letras [2]='e';
		letras [3]='x';
		letras [4]='a';
		
		for(int i=0;i<letras.length;i++) {//.lenght mide el tamaño de coleccion de datos
			System.out.println(letras[i]);// impresion vertical
		}
		
		//for each. imprimir cada elemento del array
		for(char i:letras) {
			System.out.print(i);//impresion horizontal
		}
		
		
		
		
		
		
		
		
	}

}
