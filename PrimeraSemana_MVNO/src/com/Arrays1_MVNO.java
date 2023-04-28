package com;

import java.util.Scanner;

public class Arrays1_MVNO {
	

	public static void main(String[] args) {
		int [] numeros = new int[10];
		
		Scanner num=new Scanner (System.in);
		for (int i=0; i<numeros.length;i++) {
			System.out.println("ingresa un numero:");
			numeros[i]= num.nextInt();
		}
		
		for(int i=0; i<numeros.length; i++){
			System.out.println("El indice es: "+i+""+ numeros[i] );
		}
		
	}

}
