package com;

import java.util.Scanner;

public class Ejercicio4_VMGF{

	public static void main(String[] args) {
				//Realiza un programa que lea una cadena por teclado
		        //y compruebe si es una letra mayúscula

		Scanner let = new Scanner(System.in);
		String tex1;
		String t;
		
		System.out.println("Escribe una palabra");
		t=let.next();
		tex1 = t.toLowerCase();
		
		if(t.equals(tex1)==false) {
			System.out.println("Contiene Mayusculas");
		}else
			System.out.println("No contiene Mayusculas");

	}

}
