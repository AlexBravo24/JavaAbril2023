package com;

import java.util.Scanner;

public class Arrays1_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		System.out.println("Ingresa 10 numeros cualquiera");
		int entrada;
		int entrada1;
		int entrada2;
		int entrada3;
		int entrada4;
		int entrada5;
		int entrada6;
		int entrada7;
		int entrada8;
		int entrada9;
		entrada=lector.nextInt();
		entrada1=lector.nextInt();
		entrada2=lector.nextInt();
		entrada3=lector.nextInt();
		entrada4=lector.nextInt();
		entrada5=lector.nextInt();
		entrada6=lector.nextInt();
		entrada7=lector.nextInt();
		entrada8=lector.nextInt();
		entrada9=lector.nextInt();
		lector.close();
		
		int [] numeros= {entrada, entrada1, entrada2, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9};
		
		for (int i=0; i<10; i++) {
			System.out.println("Posicion "+ i +" corresponde a " + numeros[i]);
			
		}
		
		
		

	}

}
