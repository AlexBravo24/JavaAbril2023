package com;

import java.util.Scanner;

public class Array3_ESJS {

	public static void main(String[] args) {
//		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres.

		
		String frase;
		char[]caracter;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame la frase: ");
		frase=entrada.nextLine();
		caracter=new char [frase.length()];
		
		for(int i=0;i<=frase.length()-1;i++) 
		{
			caracter[i]=frase.charAt(i);
			System.out.println(caracter[i]);
		}

	}

}
