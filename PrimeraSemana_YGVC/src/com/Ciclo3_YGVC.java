package com;

import java.util.Scanner;

public class Ciclo3_YGVC {

	public static void main(String[] args) {
		/*Realiza un programa para determinar
		 *si un String es palíndromo
		 * 
		 */
		
		 Scanner scanner=new Scanner(System.in);
		 
		 
		 System.out.println("-------VALIDAR PALINDROMOS------");
		 System.out.println("Digite la cadena a evaluar");
		 
		 String cadena=scanner.nextLine();
		 
		 System.out.println(esPalindromo(cadena));
		 
		 System.out.println(esPalindromo(cadena));
		 	 
		 }
		 
	 public static boolean esPalindromo(String cadena) {
	    	boolean aw=true;
	    	
	    	cadena=cadena.replace(" ", "");
	    	
	    	for (int i = 0; i < cadena.length()/2; i++) {
	    		if (cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)) {
	    			aw=false;
	    			break;
	    		}
				
			}
	    	
	    	return aw;
	    	
	}
	     
}
