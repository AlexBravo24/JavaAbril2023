package com;

import java.util.Scanner;

public class Ciclos4_VMGF {

	public static void main(String[] args) {
		// FRASE
		
		String frase, letra; //variable para guardar la frase
		// y otra para guardar la letra a buscar
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("ingresa una frase");
		frase = entrada.nextLine();
		System.out.println("ingresa una letra a encontrar");
		letra = entrada.nextLine();
		entrada.close();
		
		for (int i=0; i< frase.length(); i++) {
			if(frase.charAt(i) == letra.charAt(0)) {
				contador++;
		}
		}
	
	if (contador != 0) {
		System.out.println("el caracter"  +  "" + letra.charAt (0)+ "" +  "se  repite " +  contador + "veces");
	
	}else {
		System.out.println("caracter no encontrado");
	}
	}
}
