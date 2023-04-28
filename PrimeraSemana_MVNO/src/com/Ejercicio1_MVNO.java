package com;
import java.util.Scanner;
public class Ejercicio1_MVNO {
	/* Realiza un programa que reciba dos números por teclado 
	 e indique cuál es mayor o si son iguales*/
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		
		System.out.println("ingresa un numero");
	    int r=leer.nextInt();
	    System.out.println("ingresa otro numero:");
	    int n=leer.nextInt();
	    
	    if(r > n) {
	    	System.out.println("el mayor es:" + r );
	    }
	    if(n > r){
	    	System.out.println("el mayor es:" + n);
	    }
	    if(r == n){
	    	System.out.println("son iguales");
	    }
		
	}
	
}
