package com;

public class Arrays {

	public static void main(String[] args) {
		//Los arrays almacena un tipo de datos en común
		
		//como característica se necesita declarar su tamaño
		//y una vez declarado este no puede crecer o cambiar

		int [] numeros = new int [5];
		char [] letra = new char[5];
		
		numeros [0]=100;
		numeros [1]=101;
		numeros [2]=100;
		numeros [3]=101;
		numeros [4]=100;
		
		
		System.out.println(numeros [4]);
		
		//Otra manera de declarar array ya con sus valores
		
		String [] nombres = {"Ivan", "CArlos", "Yocelin", "ADrian"};
		
		System.out.println(nombres [3]);
		
		//imprimir en pantalla los valores del array
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		for (int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}

		letra [0]='a';
		letra [1]='b';
		letra [2]='c';
		letra [3]='d';
		letra [4]='1';
		for (int i=0; i<letra.length; i++) {
		System.out.print(letra[i]);
		}
		
		//for each
		for (char i:letra) {
			System.out.println(i);

		}
			}

}
