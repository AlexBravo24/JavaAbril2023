package com;

public class Arrays2_EHAG {

	public static void main(String[] args) {
		int[] numeros = new int[100];
	    int suma = 0;
	    
	    for (int i = 0; i < numeros.length; i++) {
	      numeros[i] = i + 1;
	      suma += numeros[i];
	    }
	    
	    double media = suma / (double) numeros.length;
	    
	    System.out.println("La suma de los números es: " + suma);
	    System.out.println("La media de los números es: " + media);

	}

}
