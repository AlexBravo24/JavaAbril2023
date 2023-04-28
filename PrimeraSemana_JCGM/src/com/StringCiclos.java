package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		//.length Devuelve el valor numerico de la longitud de un texto
		
		String cadena ="Hoy es 26 de Abril de 2023";
		
		System.out.println(cadena.length());
		
		//.charAt Devoler el caracter que se encuentra en la posicion o indice especificada
		
		System.out.println(cadena.charAt(0));
		
		System.out.println(cadena.charAt(cadena.length()-1)); //devuelve el ultimo caracter
		
		//.substring Devuelve el valor de una subcadena de texto a partir del indice especificado
		
		System.out.println(cadena.substring(2,7));
		
		//.ToLowerCase Convierte la cadena a minusculas
		//.ToUpperCase convierte la cadena a mayusculas
		
		//.equals compara objetos, y nos devuelve un valor true o false
		
	//. equalsIgnoreCase Compara los objetos pero ignora si tiene mayusculas o minusculas
		

	}

}
