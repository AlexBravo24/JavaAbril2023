package com;

import java.util.Scanner;

public class Ciclo4_AJCG {

	public static void main(String[] args) {
	
		String frase, letra;
		
		int contador=0;
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Ingresa una frase");
		frase= entrada.nextLine();
		System.out.println("Ingresa una letra a encontrar");
		letra=entrada.nextLine();
		entrada.close();
		
		for (int i=0; i<frase.length(); i++) {
			if (frase.charAt(i)==letra.charAt(0)) {
				contador++;
			}
		}
		if (contador!=0) {
			System.out.println("El caracter "+ letra.charAt(0)+ " se repite "+ contador);
			
		} else {
			System.out.println("Caracter no encontrado");
		}
			
	}//FIN DE MAIN

}//FIN DE CODIGO
