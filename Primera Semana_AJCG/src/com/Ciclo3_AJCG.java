package com;

import java.util.Scanner;

public class Ciclo3_AJCG {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		String palabra;
		char [] palindromo;
		int izq, der;
		System.out.println("Ingresa la palabra");
		palabra= entrada.next();
		palabra=palabra.toLowerCase();
		palindromo= palabra.toCharArray();
		izq=0;
		der= palindromo.length-1;
		entrada.close();
		while (izq<der) {
			if (palindromo[izq]==palindromo[der]) {
				der--;
				izq++;
			} else {
				System.out.println("La palabro no es un palindromo");
				break;
			}
			if (izq==der) {
				System.out.println("La palabra es un palindromo");
			}
		}
		

	}//FINAL DE MAIN

}//FINAL DE CODIGO
