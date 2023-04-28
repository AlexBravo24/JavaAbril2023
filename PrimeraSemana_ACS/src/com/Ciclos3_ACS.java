package com;

import java.util.Scanner;

public class Ciclos3_ACS {

	public static void main(String[] args) {
		
		//Realiza un programa para determinar si un String es palíndromo.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una palbra para determinar si es palindromo");
		String s=sc.nextLine();
		System.out.println(s);	
		
		int fin = s.length()-1;
		int ini = 0;
		boolean espalin=true;
		
		while(ini<fin) {
			if(s.charAt(ini)!=s.charAt(fin)) {
				espalin=false;
			}
		ini ++;
		fin --;
		}
		if(espalin)
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");
	}

}
