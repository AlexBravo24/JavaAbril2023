package com;

import java.util.Scanner;

public class Ciclos8_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Ingrese el primer numero:");
		num1=lector.nextInt();
		System.out.println("Ingrese el segundo numero:");
		num2=lector.nextInt();
		lector.close();
		int contador=num1;
      	int contador2=num2;
		int i=0;
		while (num1<num2 && contador<num2) {
			if (i==0) { 
				System.out.println(num1);
			}
			contador=contador+1;
			System.out.println(contador);
			i++;

		}
		while (num1>num2 && contador2<num1) {
			if(i==0) {
				System.out.println(num2);
			}
			contador2=contador2+1;
			System.out.println(contador2);
			i++;
		}
		if (num1==num2) {
			System.out.println("Los numeros son iguales entre ellos");
			System.out.println("No se puede mostrar una secuencia");
		}
				

	}

}